import java.util.Scanner;

public class Sum_ofNo
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a limit number: ");
        int n = scanner.nextInt();
        int sum=0;//initialising sum variable.....


        for(int i=0; i<=n; i++)// loop to check from 0 to user limit.....
        {
          sum += i;//adding the sum of numbers between the range...
        }

        System.out.println("Sum of n number is: " + sum);


    }
}
