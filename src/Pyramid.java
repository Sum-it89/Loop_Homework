import java.util.Scanner;

public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to build a Pyramid: ");
        int n = scanner.nextInt();


        for (int i=0; i<=n;i++)
        {
            System.out.println('*');

            for(int j=0; j<=i;j++)
            {
                System.out.print('*');
            }

        }
        System.out.println('*');
    }
}
