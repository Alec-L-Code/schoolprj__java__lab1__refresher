package app;
/**
 * Programmer: Alec Lund
 * Date Written: 1/23/2019
 * Program Description: This program prints out all numbers between 1 and 200 that are exclusively
 * divisible by either 5 or 6, but not both.
 */
public class Lund_prog1
{
    public static void main(String[] args) throws Exception
    {
        for(int i = 1; i <= 200; i++)
        {
            if((i % 5 == 0) ^ (i % 6 == 0)) // it is either divisible by 5 or 6 but not both.
            {
                if(i % 5 == 0) // One more check to differentiate between 5 and 6.
                    System.out.println(i + " is divisible by 5, but not 6");
                else
                    System.out.println(i + " is divisible by 6, but not 5");
            }
        }
    }
}