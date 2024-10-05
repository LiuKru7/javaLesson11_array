package home_work_2;


import java.util.Scanner;

public class Calculator {
    static Scanner doubleScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void calculator(){
        System.out.println("A- add; S- subtract, M- multiply, D- divide");

        String functionName = stringScanner.nextLine();
        if (functionName.equalsIgnoreCase("a")){
            System.out.printf("\nEnter the first number: ");
            double firstNumber = doubleScanner.nextDouble();
            System.out.printf("\nenter the second number: ");
            double secondNumber = doubleScanner.nextDouble();
            double sum= firstNumber + secondNumber;
            System.out.println(sum);
        }
        if (functionName.equalsIgnoreCase("s")){
            System.out.printf("\nEnter the first number: ");
            double firstNumber = doubleScanner.nextDouble();
            System.out.printf("\nenter the second number: ");
            double secondNumber = doubleScanner.nextDouble();
            double sum= firstNumber - secondNumber;
            System.out.println(sum);
        }
        if (functionName.equalsIgnoreCase("m")){
            System.out.printf("\nEnter the first number: ");
            double firstNumber = doubleScanner.nextDouble();
            System.out.printf("\nenter the second number: ");
            double secondNumber = doubleScanner.nextDouble();
            double sum= firstNumber * secondNumber;
            System.out.println(sum);
        }
        if (functionName.equalsIgnoreCase("d")){
            System.out.printf("\nEnter the first number: ");
            double firstNumber = doubleScanner.nextDouble();
            System.out.printf("\nenter the second number: ");
            double secondNumber = doubleScanner.nextDouble();
            double sum= firstNumber / secondNumber;
            System.out.println(sum);
        }
    }

}
