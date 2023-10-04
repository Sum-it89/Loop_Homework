import java.util.Scanner;

public class Small_bignum
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of 1st number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter value of 2nd number: ");
        int b = scanner.nextInt();

        System.out.println("Please enter value of 3rd number: ");
        int c = scanner.nextInt();


        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a + " is the highest num");

            }
            else {
                System.out.println(c + " is the highest num");

            }

        }else if(b>c)
        {
            System.out.println(b + " is the highest num");
        }else
        {
            System.out.println(c+ " is the highest number");
        }

        if (a<b)
        {
            if(a<c)
            {
                System.out.println(a + " is the smallest number");
            }
            else
            {
                System.out.println(c + " is the smallest number");
            }

        } else if (b<c)

        {
            System.out.println(b + " is the smallest number");
        }
        else
        {
            System.out.println(c + " is the smallest number");

        }











    }
}
