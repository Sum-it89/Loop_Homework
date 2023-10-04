import java.util.Scanner;

public class Range
{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the min num: ");
       int min = scanner.nextInt();

      System.out.println("Please enter the max num: ");
      int max = scanner.nextInt();
      range (min, max);

    }

    static void range(int min, int max)
    {
        for(int i = min; i<=max; i++)
        {
            System.out.println(i);
        }

    }



}
