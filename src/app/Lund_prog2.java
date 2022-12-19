package app;
/**
 * Programmer: Alec Lund
 * Date Written: 1/23/2019
 * Program Description: This program prints out all numbers between 1 and 200 that are exclusivley 
 * divisible by two user-specified inputs, but not both.
 */
import java.util.Scanner;
public class Lund_prog2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two integers to see which numbers from 1-200 are divisible by either one or the other, but not both.");
        int inputA = sc.nextInt(); // First user input
        int inputB = sc.nextInt(); // Second user input
        for(int i = 1; i <= 200; i++)
        {
            if((i % inputA == 0) ^ (i % inputB == 0)) // it is either divisible by inputA or inputB but not both.
            {
                if(i % inputA == 0) // One more check to differentiate between the two inputs.
                    System.out.println(i + " is divisible by " + inputA + ", but not " + inputB);
                else
                    System.out.println(i + " is divisible by " + inputB + ", but not " + inputA);
            }
        }
        sc.close(); // Close the scanner.
    }
}