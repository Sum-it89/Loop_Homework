import java.util.Scanner;

public class Sum_of_X
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter min number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter max number: ");
        int num2 = scanner.nextInt();

        System.out.println(Sumofx(num1,num2));


    }

    static int Sumofx(int num1, int num2)
    {
        int x=0;

        for (int i = num1; i <= num2; i++)
        {
            x += i;

        }

        return x;



    }





}
