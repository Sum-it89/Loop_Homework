import java.util.Scanner;

public class Sum_divided_by9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a minimum number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter a maximum number: ");
        int b = scanner.nextInt();


        int count =0;
        for (int i=a; i<=b; i++)
        {
            if (i%9==0)
            {
                count = count + i;
            }

        }
        System.out.println(count + " is total sum divisible by 9 ");


    }

}
