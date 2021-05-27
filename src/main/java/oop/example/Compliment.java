package oop.example;

import java.util.Random;

public class Compliment {

    public String chooseCompliment(){
        String compliment1 = ", nice to meet you.";
        String compliment2 = ", how are you?";
        String compliment3 = ", what's up?";
        String compliment4 = ", good to see you.";
        String compliment5 = ", it has been a while.";
        String compliment6 = ", hot enough for you?";

        String [] arrCompliment = {compliment1, compliment2, compliment3, compliment4, compliment5, compliment6};
        Random randomCompliment = new Random();

        int complimentSelect = randomCompliment.nextInt(arrCompliment.length);

        return arrCompliment[complimentSelect];

    }

}
