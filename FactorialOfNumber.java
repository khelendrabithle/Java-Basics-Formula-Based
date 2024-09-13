/* java programme to find Factorial of ginen nuber */

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        int fact = 1, i, num;
        System.out.println("Enter the fact number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of given number is: ");
        System.out.println(fact);
        sc.close();

    }
}