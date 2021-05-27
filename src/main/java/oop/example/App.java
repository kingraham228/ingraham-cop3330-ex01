package oop.example;
public class App
{
    public static void main( String[] args )
    {

        System.out.println(printGreeting());
        
    }

    public static String constructGreeting(Name n, Greeting g, Compliment c){
        return g.chooseGreeting() + n.getName() + c.chooseCompliment();

    }

    public static String printGreeting(){
        return constructGreeting(new Name(), new Greeting(), new Compliment());

    }

}
