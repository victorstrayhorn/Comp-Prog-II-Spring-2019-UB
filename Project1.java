package example;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

            System.out.println("Please enter the first grade:");
            Scanner userInput1 = new Scanner(System.in);
            double g1 = userInput1.nextInt();

            System.out.println("Please enter the second grade:");
            Scanner userInput2 = new Scanner(System.in);
            double g2 = userInput2.nextInt();

            System.out.println("Please enter the third grade:");
            Scanner userInput3 = new Scanner(System.in);
            double g3 = userInput3.nextInt();

            System.out.println("Please enter the forth grade:");
            Scanner userInput4 = new Scanner(System.in);
            double g4 = userInput4.nextInt();

            System.out.println("Please enter the fifth grade:");
            Scanner userInput5 = new Scanner(System.in);
            double g5 = userInput5.nextInt();

            System.out.println("Please enter the sixth grade:");
            Scanner userInput6 = new Scanner(System.in);
            double g6 = userInput6.nextInt();

            System.out.println("Please enter the seventh grade:");
            Scanner userInput7 = new Scanner(System.in);
            double g7 = userInput7.nextInt();

            System.out.println("Please enter the eighth grade:");
            Scanner userInput8 = new Scanner(System.in);
            double g8 = userInput8.nextInt();

            System.out.println("Please enter the ninth grade:");
            Scanner userInput9 = new Scanner(System.in);
            double g9 = userInput9.nextInt();

            System.out.println("Please enter the ten grade:");
            Scanner userInput10 = new Scanner(System.in);
            double g10 = userInput10.nextInt();

            System.out.println("Please enter the eleventh grade:");
            Scanner userInput11 = new Scanner(System.in);
            double g11 = userInput11.nextInt();

        double sum = g1 + g2 + g3 + g4 + g5 + g6 + g7 + g8 + g9 + g10 + g11;

        double average = sum / 11;

        double g_rounded = Math.round(average * 100) / 100.00; //This takes the average of the grades and rounds the decimal to the hundredths.

        System.out.println("You got a " + g_rounded); // Displays the grade rounded.


    }

}



