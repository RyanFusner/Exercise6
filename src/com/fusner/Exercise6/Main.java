package com.fusner.Exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String str = input.promptString("Enter an string:");
        int num1 = input.promptInt("Enter an int:");
        double num2 = input.promptDouble("Enter an double:");
        System.out.println("\n" + str);
        System.out.println(num1);
        System.out.println(num2);
    }
}

class input
{
    private static Scanner scanner = new Scanner(System.in);

    public static String promptString(String message)
    {
        String input = "";
        System.out.println(message);
        input = scanner.next();
        return input;
    }

    static public int promptInt(String message)
    {
        int input = 0;
        boolean correctType = false;
        while (!correctType)
        {
            correctType = true;
            System.out.println(message);
            try
            {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                correctType = false;
                System.out.println("Wrong type");
            }
        }
        return input;
    }

    public static double promptDouble(String message)
    {
        double input = 0.0;
        boolean correctType = false;
        while (!correctType)
        {
            correctType = true;
            System.out.println(message);
            try
            {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextDouble();
            }
            catch (InputMismatchException e)
            {
                correctType = false;
                System.out.println("Wrong type");
            }
        }
        return input;
    }

}
