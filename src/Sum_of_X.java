import java.util.Scanner;

public class Sum_of_X
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter min number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter max number: ");
        int num2 = scanner.nextInt();

        System.out.println(Sumofx(num1,num2));//calling method to get the sum of the range....


    }

    static int Sumofx(int num1, int num2)//method that returns int data type...
    {
        int x=0; //initialising the variable....

        for (int i = num1; i <= num2; i++)//for loop to check between the range of user input....
        {
            x += i;//adding each number between range into x variable...
        }

        return x;



    }





}
