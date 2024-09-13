/* Java program to find surface area of cylinder */

import java.util.Scanner;

public class surfaceAreaOfCylinder {

    public static void main(String[] args) {
        int radius, height;
        double sacylinder, pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = sc.nextInt();

        System.out.println("Enter the height: ");
        height = sc.nextInt();

        sacylinder = (2 * pi * radius * height) + (2 * pi * radius * radius);
        System.out.println("Surface Area Of Cylinder: ");
        System.out.println(sacylinder);
        sc.close();

    }

}