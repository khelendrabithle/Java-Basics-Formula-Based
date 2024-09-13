
/* Java program to find surface area of cuboid */


import java.util.Scanner;
public class surfaceAreaOfCuboid {
    
    public static void main(String[]args)
    {
        int length , height , width , sa ;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length: ");
        length = sc.nextInt();

        System.out.println("Enter the height: ");
        height = sc.nextInt();

        System.out.println("Enter the width: ");
        width = sc.nextInt();

        sa = (2*length*width) + (2*length*height) + (2*height*width);

        System.out.println("Surface of Area is: ");
        System.out.println(sa);
        sc.close();

    }
}