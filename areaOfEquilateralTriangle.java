/*  Java Program to find area of equilateral triangle */

import java.util.Scanner;

public class areaOfEquilateralTriangle {

    public static void main(String[] args) {
        double side, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Side of an Equilateral Triangle: ");
        side = sc.nextDouble();

        area = Math.sqrt(3) / 4 * side * side;

        System.out.format("The Area of Equilateral Triangle = %.3f\n", area);
        sc.close();
    }
}