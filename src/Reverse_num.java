import java.util.Scanner;

public class Reverse_num
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int num = scanner.nextInt();

        for(int i=num; i>=0; i--) //backwards loop to reduce the range by 1.....
        {
            System.out.println("Reversed num: " + i);
        }
    }
}
