import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        float n = scanner.nextFloat();

        float result =1;//result variable initialised with 1.......

        for(float i= 1; i<=n; i++)//for loop to check the condition through the range until n....
        {
             result = result *i;//multiplying and adding the value to variable.....

        }

            System.out.println("Factorial of the input value is: " + result);




    }









}
