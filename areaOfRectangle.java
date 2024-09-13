/* Java Program to find area of rectangle */

import java.util.Scanner;

public class areaOfRectangle {

  public static void main(String[] args) {

    int area, height, width;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Height: ");
    height = sc.nextInt();

    System.out.println("Enter Width: ");
    width = sc.nextInt();

    area = height * width;
    System.out.println(area);
    sc.close();

  }
}