import java.util.Scanner;

public class Divide_num
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter min number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter max number: ");
        int num2 = scanner.nextInt();



        for (int i = num1; i <= num2; i++)
        {
            if (i % 3 == 0)
            {
                System.out.print(i + " is divisible by 3\n");

            }

        }
        System.out.println("______________________________");

        for(int j = num1; j<=num2; j++)
        {
            if(j%5==0)
            {
                System.out.print(j + " is divisible by 5\n");
            }
        }


    }



}
