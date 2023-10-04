import java.util.Scanner;

public class Prime_numbers
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();

        loop(n);//calling the method
    }

    static boolean loop(int n)//boolean method that returns int data type...
    {
        for (int i = 2; i <= Math.sqrt(n); i++)//loop to check from 2 to the square of the n value of the number....
        {
            if (n % i == 0)//condition to check whether user value is divisible by the numbers in the range..
            {
                System.out.println("is not a prime number");
                return false;
            }
        }
        System.out.println("is a Prime");
        return true;




    }





}
