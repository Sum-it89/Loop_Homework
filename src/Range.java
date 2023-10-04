import java.util.Scanner;

public class Range
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
      Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the min num: ");
       int min = scanner.nextInt();

      System.out.println("Please enter the max num: ");
      int max = scanner.nextInt();
      range (min, max);//calling the method to enter the range from the user....

    }

    static void range(int min, int max)//method to return a range entered by the user....
    {
        for(int i = min; i<=max; i++)
        {
            System.out.println(i);
        }

    }



}
