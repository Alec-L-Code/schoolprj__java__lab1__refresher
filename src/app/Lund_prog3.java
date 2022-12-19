package app;
/**
 * Programmer: Alec Lund
 * Date Written: 1/23/2019
 * Program Description: This program uses two overloaded methods named "average" to return the average of
 * both a integer array and a double array. The integer array average is rounded.
 */
public class Lund_prog3
{
    public static void main(String[] args) throws Exception
    {
        int[] integerArr = new int[] {5, 20, 31, 4, 6, 12, 18, 4}; // The sum of this array is 100 with 8 ittems.
        double[] doubleArr = new double[] {10.4, 5.26, 10.18, 9.23, 7.89}; // The sum of this array is 42.96 with 5 items.
        System.out.println("The average of 'Integer Arr' is: " + average(integerArr));
        System.out.println("The average of Double Arr is: " + average(doubleArr));
    }
    public static int average(int[] arr)
    {
        int sum = 0;
        for(int number : arr) { sum+= number; }
        return (int)Math.round(((double)sum/arr.length)); // Returns the rounded average of all the integers in the array 
    }
    public static double average(double[] arr)
    {
        double sum = 0.0;
        for(double number : arr) { sum+= number; }
        return (sum/arr.length); // Returns the average of all the doubles in a double type.
    }
}