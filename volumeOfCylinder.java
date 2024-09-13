/* java programme to find volume of cylinder */


import java.util.Scanner;
public class volumeOfCylinder {
    
public static void main(String[]args)
{
    int radius , height ;
    double volume,  pi=3.14f;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter radius:"); 
    radius=sc.nextInt();

    System.out.println("Enter height: ");
    height=sc.nextInt();

    volume = pi * radius * radius * height;
    System.out.println("The Volume of Cylinder: ");
    System.out.println(volume);
    sc.close();

}
}