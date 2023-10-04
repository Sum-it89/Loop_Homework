import java.util.Scanner;

public class Prime_numbers
{
    public static void main(String[] args)
    {
        loop(41);


    }



    static boolean loop(int n)
    {


        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                System.out.println("is not prime");
                return false;

            }


        }

        System.out.println("is Prime");
        return true;




    }





}
