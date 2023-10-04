import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a limit number: ");
        int n = scanner.nextInt();
        int a=0, b=1;
        int result=0;

        System.out.println(a+ "\n" +b);
        for(int i=0; i<=n; i++)
        {

            result = a+b;
            a=b;
            b=result;


            System.out.println(result);

        }




    }
}
