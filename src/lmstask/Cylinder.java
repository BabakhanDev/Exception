package lmstask;

import java.util.Scanner;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) throws IllegalArgumentException {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Радиус жана бийиктик нөлдөн чоң болушу керек.");
        }
        this.radius = radius;
        this.height = height;
    }

    public double getCilinderPloshad() {
        return 2*Math.PI * radius*( height + radius);
    }
    public double getCilinderObiom () {
        return Math.PI * radius * radius * height;
    }
}