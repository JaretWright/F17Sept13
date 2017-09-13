package f17sept13;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class AskMyName {
    public static void main(String[] args)
    {
        System.out.print("Please enter your name: ");
        Scanner keyboard = new Scanner(System.in);
        
        String myName = keyboard.nextLine();
        
        System.out.printf("%nHello %s%n", myName);
        
    }    
}
