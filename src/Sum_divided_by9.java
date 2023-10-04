import java.util.Scanner;

public class Sum_divided_by9
{
    public static void main(String[] args)
    {
        //scanner object from java library to get user input...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a minimum number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter a maximum number: ");
        int b = scanner.nextInt();


        int count =0;//count variable initialised.....
        for (int i=a; i<=b; i++)//for loop to check between the range...
        {
            if (i%9==0)//condition to check whether each number between range is divisible by 9...
            {
                count = count + i;//adding once each number meets the criteria and adding it in count variable.
            }

        }
        System.out.println(count + " is total sum divisible by 9 ");//printing the result...


    }

}
