/* java programme to find the volume of cone */

import java.util.Scanner;

public class volumeOfCone {

    public static void main(String[] args) {
        int radius, height;
        double pi = 3.14, volume;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = sc.nextInt();

        System.out.println("Enter height: ");
        height = sc.nextInt();

        volume = pi * radius * radius * (height / 3);
        System.out.println("volume of cone is: ");
        System.out.println(volume);

        sc.close();
    }
}