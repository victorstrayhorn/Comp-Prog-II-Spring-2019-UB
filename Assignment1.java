package example;

import java.util.Scanner;

public class Assignment1 {

    public static void main (String[] args) { //Main Method

        System.out.println("************          ***             *           *");
        System.out.println("*          *      *        *         ***         * *");
        System.out.println("*          *     *          *       *****       *   *");
        System.out.println("*          *    *            *        *        *     *");
        System.out.println("*          *    *            *        *       *       *");
        System.out.println("*          *     *           *        *        *     * ");
        System.out.println("*          *      *         *         *         *   *");
        System.out.println("*          *       *       *          *          * *");
        System.out.println("************          ***             *           *");

        System.out.println("Enter an Integer:\n");

        int variableB = 2;
        int variableC = 3;
        double variableA = variableB * variableC;

        System.out.println("The product of variables b and c: " + variableA + "\n");
        System.out.println("Variable b was: " + variableB + ". Variable C was: " + variableC + ".\n");

        //This program performs a sample payroll calculation.

        System.out.println("This program will give you the the Sum, Product, Difference, and Quotient of two integers.\n");

        System.out.println("Please enter two integers:");

        Scanner userInput1 = new Scanner(System.in);
        int a = userInput1.nextInt();

            System.out.println("You entered: " + a + ", for your first integer.");

        Scanner userInput2 = new Scanner(System.in);
        int b = userInput2.nextInt();

            System.out.println("You entered: " + b + ", for your second integer.\n");

            double sum = a + b;
            double product = a * b;
            double difference = a - b;
            double quotient = (double) a / b;

                System.out.println("Sum: " + sum);
                System.out.println("Product: " + product);
                System.out.println("Difference: " + difference);
                System.out.println("Quotient: " + quotient);





















    }

}
