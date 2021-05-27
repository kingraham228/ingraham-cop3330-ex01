package oop.example;
public class App
{
    public static void main( String[] args )
    {
        Name userName = new Name();
        Greeting userGreeting = new Greeting();
        Compliment userCompliment = new Compliment();

        constructGreeting(userName, userGreeting, userCompliment);

    }

    public static void constructGreeting(Name n, Greeting g, Compliment c){
        System.out.printf("%s%s%s",g.chooseGreeting(), n.getName(), c.chooseCompliment());

    }
}
