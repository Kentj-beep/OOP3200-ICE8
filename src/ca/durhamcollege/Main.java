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
        String name = "";
        int age = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.printf("You entered: %s", name);
    }
}
