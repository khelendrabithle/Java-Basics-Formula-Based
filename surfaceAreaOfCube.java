/* java programme to find surface area of cube */

import java.util.Scanner;

public class surfaceAreaOfCube {

    public static void main(String[] args) {
        int a, sacube;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        a = sc.nextInt();

        sacube = 6 * a * a;
        System.out.println("Surface Area Of Cube is: ");
        System.out.println(sacube);
        sc.close();
    }

}