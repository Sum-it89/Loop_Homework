import java.util.Scanner;

public class Pyramid
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to build a Pyramid: ");
        int n = scanner.nextInt();


        for (int i=0; i<=n;i++)//outer loop to print * from top to bottom...
        {
            System.out.println('*');

            for(int j=0; j<=i;j++)//inner loop to connect with outer loop so that it prints along with outer loop..
            {
                System.out.print('*');
            }

        }
        System.out.println('*');//to even out the pyramid in the last line..........
    }
}
