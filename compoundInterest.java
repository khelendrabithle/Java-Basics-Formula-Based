/*Java Program to calculate compound interest */

import java.util.Scanner;

public class compoundInterest {

    public static void main(String[] args) {

        double ammount;
        double principal;
        double rate;
        double time;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal Ammount: ");
        principal = sc.nextDouble();

        System.out.println("Enter the rate: ");
        rate = sc.nextDouble();

        System.out.println("Enter the time: ");
        time = sc.nextDouble();

        ammount = principal * ((1 + rate / 100) * time);
        System.out.println(ammount);

    }
}
