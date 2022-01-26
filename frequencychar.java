import java.util.Scanner;
public class frequencychar 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter a character whose Frequency is to found");
        char character = sc.nextLine().charAt(0);
        int count = 0;
        for (int i=0; i<str.length();i++)
        {
            if(character == str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of the give character:: "+count);
    }
}
