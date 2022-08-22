//Program to find whether 2 numbers are equal by three decimal places.

import java.util.Scanner;

public class DecimalComparator
{
    public static void main(String[] args)
    {
        Scanner InputNum1 = new Scanner(System.in);
        Scanner InputNum2 = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        System.out.println("Enter the First Number:");
        double num1= InputNum1.nextDouble();
        InputNum1.nextLine();
        System.out.println("Enter the Second Number:");
        double num2= InputNum2.nextDouble();
        InputNum2.nextLine();

        areEqualByThreeDecimalPlaces(num1,num2);
    }

    public static void areEqualByThreeDecimalPlaces(double one, double two)
    {
        int a = (int) (one * 1000);
        int b = (int) (two * 1000);

        if(a == b)
        {
            System.out.println("The 2 numbers are equal by 3 decimal places ");
        }
        else
        {
            System.out.println("The 2 numbers are not equal by 3 decimal places ");
        }
    }
}
