import java.util.Scanner;

public class Hello

    //random comment
{
    /* This program prints a dialog between the computer and the user.*/
    public static void main(String[] args)
    {
        Scanner myScnr = new Scanner(System.in);
        String response;

        System.out.print("Hello. What is your name? ");
        response = myScnr.next();
        System.out.print("It's nice to meet you, "+ response +". How old are you? ");
        response = myScnr.next();
        /* This part was super annoying to get past!!! */
        System.out.print("I see that you are still quite young at only "+ response +".\n");
        System.out.print("Where do you live? ");
        response = myScnr.next();
        System.out.print("Wow! I've always wanted to go to "+ response +". Thanks for chatting with me. Bye!");

    }
}
