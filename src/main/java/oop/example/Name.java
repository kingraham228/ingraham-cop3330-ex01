package oop.example;

import java.util.Scanner;

public class Name {

    public String getName(){

        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in).useDelimiter("\\n");

        return input.next();



    }
}
