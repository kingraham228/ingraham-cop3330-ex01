package challenge2;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class Name {

    public String getName(){

        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);

        return input.nextLine();



    }
}
