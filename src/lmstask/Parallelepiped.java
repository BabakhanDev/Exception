package lmstask;

import java.util.Scanner;

public class Parallelepiped {
   private double height;
   private double length ;
    private double width;

    public Parallelepiped(double height, double length, double width) throws IllegalArgumentException {
        if (length<= 0 || width<=0 || height<=0){
            throw new IllegalArgumentException("Өлчөмдөр нөлдөн чоң болушу керек.");
        }
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getParalPloshad (){

        return 2*((height * length) + (length * width) + (height * width));
    }

    public double getParalObiom (){
       return length*width*height;
    }
}
