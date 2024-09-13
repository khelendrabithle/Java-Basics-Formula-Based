/* Java Program to find volume of cuboid */

import java.util.Scanner;

public class volumeOfCuboid {

    public static void main(String[] args) {
        int length, width, height, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the width: ");
        width = sc.nextInt();

        System.out.println("enter the height: ");
        height = sc.nextInt();

        System.out.println("enter the length: ");
        length = sc.nextInt();

        volume = length * width * height;
        System.out.println("volume of cuboid is: ");
        System.out.println(volume);
        sc.close();
    }

}