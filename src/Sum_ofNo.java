import java.util.Scanner;

public class Sum_ofNo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a natural num: ");
        int n = scanner.nextInt();
        int sum=0;


        for(int i=0; i<=n; i++)
        {
          sum += i;
        }

        System.out.println("Sum of n number is: " + sum);


    }
}
