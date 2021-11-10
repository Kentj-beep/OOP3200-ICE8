/**
 * @author Jacob Kent
 * @studentID 100609784
 * @version 0.0.1
 * @date Nov 10, 2021
 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Set up Scanner
        Scanner keyboard = new Scanner(System.in);

        // Declarations
        String name = "";
        float age = 0.0f;
        final float minimumAge = 0.0f;
        final float maximumAge = 120.0f;

        boolean validAge = false;

        // Input
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();


        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                if(age <= minimumAge || age >= maximumAge)
                {
                    System.out.println("Error: Age must be within range between 0.0 and 120.0.");
                    keyboard.nextLine();
                }
                else
                {
                    validAge = true;
                }
            }
            catch (Exception e)
            {
                System.out.println("Error: Invalid input for floating-point number.");
                keyboard.nextLine();
            }

        }
        while(!validAge);

        // Output
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}
