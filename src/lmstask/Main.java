package lmstask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

      try    {
        System.out.println("Фигураны тандаңыз: 1 - Параллелепипед, 2 - Цилиндр");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Параллелепипеддин узундугун киргизиңиз:");
                double length = scanner.nextDouble();

                System.out.println("Параллелепипеддин туурасын киргизиңиз:");
                double width = scanner.nextDouble();

                System.out.println("Параллелепипеддин бийиктигин киргизиңиз:");
                double height = scanner.nextDouble();

                Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                System.out.println("Параллелепипеддин аянты: " + parallelepiped.getParalPloshad());
                System.out.println("Параллелепипеддин көлөмү: " + parallelepiped.getParalObiom());
            }
            case 2 -> {
                System.out.println("Цилиндрдин радиусун киргизиңиз:");
                double radius = scanner.nextDouble();

                System.out.println("Цилиндрдин бийиктигин киргизиңиз:");
                double height = scanner.nextDouble();

                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("Цилиндрдин аянты: " + cylinder.getCilinderPloshad());
                System.out.println("Цилиндрдин көлөмү: " + cylinder.getCilinderObiom());
            }
            default -> System.out.println("Туура эмес тандоо. Программаны кайрадан баштаңыз.");
        }
    } catch (InputMismatchException e) {
        System.out.println("Ката: Сандарды киргизиңиз. Тамгалар же башка символдор киргизилбеши керек.");
    } catch (IllegalArgumentException e) {
        System.out.println("Ката: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Белгисиз ката: " + e.getMessage());
    } finally {
        scanner.close();
    }
}}

