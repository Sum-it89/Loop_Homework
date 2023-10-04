import java.util.Scanner;

public class Reverse_num
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int num = scanner.nextInt();

        for(int i=num; i>=0; i--)
        {
            System.out.println("Reversed num: " + i);
        }
    }
}
