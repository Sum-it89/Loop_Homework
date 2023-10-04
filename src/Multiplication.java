import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();


        for(int i=1; i<=1;i++) //Outer for loop
        {
            for(int j=1; j<=10; j++)//inner for loop
            {
                System.out.println(num+ "X" + j + " = "+ num*j); //printing with concatenation to get the desired table...
            }
        }
    }
}
