package oop.example;

import java.util.Scanner;

public class Name {

    public String getName(){
        Scanner input = new Scanner(System.in).useDelimiter("\\n");

        System.out.print("Enter your name: ");
        return input.next();

    }
}
