import java.util.Scanner;

public class Count_A
{

    public static void main(String[] args)
    {
        //scanner object to get user input..
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String word = scanner.next();


        int count = 0;// initializing count variable....
        char alpha= 'a'; //initializing count variable by placing a char...


        for (int i = 0; i <word.length() ; i++)//for loop to check through the length of the string.......

        {
            if(word.charAt(i) ==alpha)//comparing if the counter when ran through the length of the string detects the given char...
            {
                count++;
            }


        }
        System.out.println("Number of 'a' character in the word: " + count);//printing the result after adding the count variable....





    }
}
