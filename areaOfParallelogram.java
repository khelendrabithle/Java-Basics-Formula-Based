/* Java Program to find area of parallelogram */

import java.util.Scanner;

public class areaOfParallelogram {

    public static void main(String[] args) {
        int area, base, height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base:");
        base = sc.nextInt();

        System.out.println("Enter height: ");
        height = sc.nextInt();

        area = height * base;

        System.out.println("Area of Parallalogram is: ");
        System.out.println(area);
        sc.close();

    }
}
