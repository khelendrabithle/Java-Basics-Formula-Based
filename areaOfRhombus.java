/* Java Program to find area of rhombus */

 import java.util.Scanner;
 public class areaOfRhombus {
public static void main(String[]args){

int d1,d2,areaofrhombus;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the value of d1: ");
d1 = sc.nextInt();

System.out.println("Enter the value of d2: ");
d2=sc.nextInt();

areaofrhombus = (d1*d2)/2;
System.out.println("Area of Rhombus: ");
System.out.println(areaofrhombus);

}
}