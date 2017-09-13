package f17sept13;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WackyWeather {
    public static void main(String[] args)
    {
        //define variables and objects to be used in the program
        int temperature;
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for the temperature
        System.out.printf("Please enter the temperature outside: ");
        temperature = keyboard.nextInt();
        
        //if it is at OR below 0, tell them to put on a coat
        if (temperature <= 0)
            System.out.printf("Brrr...put on a coat%n");
        
        //if it is above 0, but below 20, tell them to put on a sweater
        if (temperature > 0 && temperature < 20)
            System.out.printf("Nice, but put on a sweater%n");
        
        //if it is above 20, say "wear what you want"
        if (temperature >= 20)
            System.out.printf("Great day! Wear what you want%n");
    }
}
