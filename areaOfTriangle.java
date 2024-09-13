/* java program to find area of triangle */

import java.util.Scanner;
public class areaOfTriangle {

public static void main(String[]args)
{
    int height,base,area;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Height: ");
    height = sc.nextInt();

    System.out.println("Enter Base: ");
    base = sc.nextInt();

    area = (height * base)/2;
    System.out.println(area);
}
    
}