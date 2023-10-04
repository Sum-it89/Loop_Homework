import java.util.Scanner;

public class Small_bignum
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of 1st number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter value of 2nd number: ");
        int b = scanner.nextInt();

        System.out.println("Please enter value of 3rd number: ");
        int c = scanner.nextInt();


        if(a>b)// Logic to compare two numbers in two variables......
        {
            if(a>c)
            {
                System.out.println(a + " is the highest num");//printing the variable tht is higher than the other.......

            }
            else {
                System.out.println(c + " is the highest num");//printing the variable tht is higher than the other.......

            }

        }else if(b>c)//Logic to compare two numbers in two variables......
        {
            System.out.println(b + " is the highest num");//printing the variable tht is higher than the other.......
        }else
        {
            System.out.println(c+ " is the highest number");//printing the variable tht is higher than the other.......
        }

        if (a<b)// Logic to compare two numbers in two variables......
        {
            if(a<c)
            {
                System.out.println(a + " is the smallest number");//printing the variable tht is smaller than the other.......
            }
            else
            {
                System.out.println(c + " is the smallest number");//printing the variable tht is smaller than the other.......
            }

        } else if (b<c)// Logic to compare two numbers in two variables......

        {
            System.out.println(b + " is the smallest number");//printing the variable tht is smaller than the other.......
        }
        else
        {
            System.out.println(c + " is the smallest number");//printing the variable tht is smaller than the other.......

        }











    }
}
