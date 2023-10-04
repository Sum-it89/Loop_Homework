import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();


        for(int i=1; i<=1;i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.println(num+ "X" + j + " = "+ num*j);
            }
        }
    }
}
