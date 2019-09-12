package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        double aSquared = Math.pow(length1, 2);
        double bSquared = Math.pow(length2, 2);
        return Math.sqrt(aSquared + bSquared);
    }

    public static void main(String [] args) {
        Scanner length1 = new Scanner(System.in);
        System.out.println("Enter side length 1:");
        double a = length1.nextDouble();

        Scanner length2 = new Scanner(System.in);
        System.out.println("Enter side length 2:");
        double b = length2.nextDouble();


        System.out.println("The hypotenuse of a triangle with side lengths " + a + " and " + b + " is: " + calculateHypotenuse(a,b));
    }
}
