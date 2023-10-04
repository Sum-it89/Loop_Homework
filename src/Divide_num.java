import java.util.Scanner;

public class Divide_num
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter min number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter max number: ");
        int num2 = scanner.nextInt();



        for (int i = num1; i <= num2; i++)//for loop to check the condition through the range....
        {
            if (i % 3 == 0)//condition to check if the number between the range is divisible by 3...
            {
                System.out.print(i + " is divisible by 3\n");

            }

        }
        System.out.println("______________________________");// separating the two different result....

        for(int j = num1; j<=num2; j++)//for loop to check the condition through the range....
        {
            if(j%5==0)//condition to check if the number between the range is divisible by 3...
            {
                System.out.print(j + " is divisible by 5\n");
            }
        }


    }



}
