package oop.example;

import java.util.Scanner;

public class Name {
    Scanner input = new Scanner(System.in);

    public String getName(){
        System.out.println("What is your name?");
        return input.nextLine();
    }

    public String printName(){
        String name = getName();
        return String.format("Hello, %s, nice to meet you!",name);
    }
}
