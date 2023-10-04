import java.util.Scanner;

public class Count_A
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String word = scanner.next();


        int count = 0;
        char alpha= 'a';


        for (int i = 0; i <word.length() ; i++)

        {
            if(word.charAt(i) ==alpha)
            {
                count++;
            }


        }
        System.out.println(count);





    }
}
