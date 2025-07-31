package Assesment;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch != 5) {
            System.out.println("1. ADD");
            System.out.println("2. SUB");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Exit");
            System.out.println("Enter your ch:");
            ch = sc.nextInt();
            if (ch >= 1 && ch <= 4) {
                System.out.println("Enter first number:");
                int num1 = sc.nextInt();
                System.out.println("Enter second number:");
                int num2 = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Addition:" + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Subraction:" + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Multiplication" + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0)
                            System.out.println("Division" + (num1 / num2));
                        else
                            System.out.println("Division by zero");
                        break;
                }
            } else if (ch == 5) {
                System.out.println("Exiting Good bye....");
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

}
