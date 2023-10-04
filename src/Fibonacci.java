import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a limit number: ");
        int n = scanner.nextInt();
        int a=0, b=1;//initialising two first variables with a default value....
        int result=0;//result variable initialised....

        System.out.println(a+ "\n" +b);//printing the first two default value....
        for(int i=0; i<=n; i++)//for loop to check from 0 to user input....
        {

            result = a+b;//Logic to add previous two number and placing it in the 3rd variable...
            a=b;
            b=result;


            System.out.println(result);

        }




    }
}
