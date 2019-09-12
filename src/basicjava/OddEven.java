package basicjava;

import java.util.Scanner;

public class OddEven {
    public static boolean isOdd(int aNumber) {
        if ((aNumber % 2) == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int inNumber = in.nextInt();

        if (isOdd(inNumber)) {
            System.out.println("That is odd");
        }
        else {
            System.out.println("That is even");
        }

//        if (isOdd(inNumber)) {
//            System.out.println("Wow, that's odd!");
//        }
    }
}
