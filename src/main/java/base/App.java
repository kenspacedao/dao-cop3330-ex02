package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        int counter = 0;                                        //Counter for a future for loop
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);                 //Creating an object for scanner
        String str = input.nextLine();                          //Creating an object for str
        //System.out.print(str);

        for(int i = 0; i < str.length(); i++) {                 //The for loop loops through the entire string and looks for characters and not spaces and adds to the counter
            if(str.charAt(i) != ' ')
                counter++;
        }
            System.out.println("\n" + str + " has " + counter + " character.");
    }
}
