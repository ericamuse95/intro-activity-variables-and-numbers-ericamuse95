package com.kenzie.app;

public class Main {

    public static void exerciseOne(){
        System.out.println("Exercise One"); // Do not modify the lines like this before each exercise, these are to make the console output more readable :)
        // - Print the number 16 to the console.
        //
        // Write your code here
        System.out.println("16");

    }
    public static void exerciseTwo(){
        System.out.println("Exercise Two");
        // - Print the result of the expression six divided by three to the console.
        //
        // Write your code here
        System.out.println(6/3);

    }
    public static void exerciseThree(){
        System.out.println("Exercise Three");
        // - Add parenthesis to the expression below so that it prints 16 to the console (instead of 13)
        //
        // Write your code here

        System.out.println((1 + 3) * 4);
    }
    public static void exerciseFour(){
        System.out.println("Exercise Four");
        // - Un-comment the following variable, and then on the next line use System.out.println() to print it to the console.

         int myNumber = 6;
        // Write your code here
        System.out.println(myNumber);

    }
    public static void exerciseFive(){
        System.out.println("Exercise Five");
        // - create a double variable called "otherNumber", assign the number 4.25 it, and then print it to the console on the next line.
        //
        // Write your code here
        double otherNumber = 4.25d;
        System.out.println(otherNumber);

    }
    public static void exerciseSix(){
        System.out.println("Exercise Six");
        // - Now uncomment and multiply myNumber by otherNumber and assign that to a new double variable called "result".
        // - Then log it to the console
        // Hint: You can multiply with the * operator: For example, 3 * 5 would be 15
        //
        // Write your code here
        int myNumber = 6;
        double otherNumber = 4.25;
        double result = myNumber * otherNumber;
        System.out.println(result);



    }
    public static void exerciseSeven(){
        System.out.println("Exercise Seven");
        // - Create two int Variables, called "a" and "b".  Assign the number 5 to "a" and the number 8 to "b".
        // - Then create a third int variable, "difference".  Subtract b from a and assign the result to the "difference" variable
        // Hint: subtraction uses the - operator
        // Then Print the difference to the console.  (This should print a negative number!)
        //
        // Write your code here
        int a = 5;
        int b = 8;
        int difference = a - b;
        System.out.println(difference);


    }
    public static void exerciseEight(){
        System.out.println("Exercise Eight");
        // - For each of the following four things, create a variable with a meaningful name to represent that idea and then assign it a number.
        // - * The number of pets you have
        // - * The number of pairs of sunglasses you own
        // - * The rating from 1-10 you would give to the last meal you ate.
        // - * How many days it has been since you last went to the grocery store.
        // - Remember to use camelCase to name your variables!
        // - Print the value of each of your variables using System.out.println()
        // Hint: One popular way to name a variable representing a number of something is to name it like "numHats" or "numEggsInFridge"
        //
        // Write your code here
        int numPets = 4, numSunGlasses = 1, numPorkChops = 8, numDaysSinceGrocery = 7;
        System.out.println(numPets);
        System.out.println(numSunGlasses);
        System.out.println(numPorkChops);
        System.out.println(numDaysSinceGrocery);


    }



    public static void main(String[] args) {

        /*************************/
        /* Variables and Numbers */
        /*************************/

        // ----------------------------------------------------------------------------------------------
        exerciseOne();
        // ----------------------------------------------------------------------------------------------
        exerciseTwo();
        // ----------------------------------------------------------------------------------------------
        exerciseThree();
        // ----------------------------------------------------------------------------------------------
        exerciseFour();
        // ----------------------------------------------------------------------------------------------
        exerciseFive();
        // ----------------------------------------------------------------------------------------------
        exerciseSix();
        // ----------------------------------------------------------------------------------------------
        exerciseSeven();
        // ----------------------------------------------------------------------------------------------
        exerciseEight();

        // When you are done, your console output should match the following: (Except your exercise 8 will be different.)
        /*
        Exercise One
        16
        Exercise Two
        2
        Exercise Three
        16
        Exercise Four
        6
        Exercise Five
        4.25
        Exercise Six
        25.5
        Exercise Seven
        -3
        Exercise Eight
        2
        3
        9
        12
        */


    }
}
