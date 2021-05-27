package oop.example;

import java.util.Random;

public class Greeting {

    public String chooseGreeting(){
        String greeting1 = "Hello, ";
        String greeting2 = "Hi, ";
        String greeting3 = "Howdy, ";
        String greeting4 = "Bonjour, ";
        String greeting5 = "Salutations, ";
        String greeting6 = "Greetings, ";

        String [] arrGreeting = {greeting1, greeting2, greeting3, greeting4, greeting5, greeting6};
        Random randomGreeting = new Random();

        int greetingSelect = randomGreeting.nextInt(arrGreeting.length);

        return arrGreeting[greetingSelect];

    }

}
