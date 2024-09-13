/* Java Program to find volume of sphere */

import java.util.Scanner;

public class volumeOfSphere

{
    public static void main(String[] args) {
        double volume;
        float pi = 3.14f;
        int radius;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius");
        radius = sc.nextInt();
        volume = (3.0 / 4.0) * pi * (radius * radius * radius);

        System.out.println("Volume of sphere is: ");
        System.out.println(volume);
        sc.close();

    }

}