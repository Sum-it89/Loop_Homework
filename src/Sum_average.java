import java.util.Scanner;

public class Sum_average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a minimum number: ");
        float a = scanner.nextFloat();

        System.out.println("Please enter a maximum number: ");
        float b = scanner.nextFloat();


        System.out.println("Sum of the range between a & b: " + total_sum(a,b));
        System.out.println("Average of the range between a & b: " + count_average(a,b));


    }

    static float total_sum(float a, float b)
    {
        float sum=0;

        for (float i = a; i <= b; i++)
        {
            sum = sum + i;
        }

       return sum;

    }

    static float count_average(float a, float b)
    {
        float sum=0;
        float count=0;
        for (float i = a; i <= b; i++)
        {
            count++;
            sum= sum+i;

        }

        return (sum/count);

    }





}
