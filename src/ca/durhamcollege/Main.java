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

        // Multi-dimensional array example
        System.out.println("Multi-dimensional Array example:");
        int rows = 8;
        int columns = 8;
        float[][] board = new float[rows][columns];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < columns; y++)
            {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Get 10 Random Values:");
        for (int i = 0; i < 10; i++)
        {
            int randRows = (int)(Math.random() * rows);
            int randColumns = (int)(Math.random() * columns);
            int printRow = randRows + 1;
            int printColumn = randColumns + 1;
            System.out.print("For row: " + printRow + " col: " + printColumn + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randColumns]);

        }

        // Output
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}
