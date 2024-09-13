/* Java Program to find area of Prism */

import java.util.Scanner;

public class areaOfPrizm {
    public static void main(String[] args) {

        int length, height, width, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        length = sc.nextInt();

        System.out.println("Enter the height: ");
        height = sc.nextInt();

        System.out.println("Enter the width: ");
        width = sc.nextInt();

        area = 2 * ((length * height) + (width * height) + (length * width));
        System.out.println("area of Prism: ");
        System.out.println(area);
        sc.close();

    }
}