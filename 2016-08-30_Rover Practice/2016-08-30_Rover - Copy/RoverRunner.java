import java.util.Scanner;
/**
 * Write a description of class RoverRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoverRunner
{
   public static void playerName()
   {
       Scanner user_input = new Scanner(System.in);
       
       System.out.println("What is your rover's name?");
       String name;
       name = user_input.next();
       
       System.out.println("Your rover is " + name + ".");
   }
    
    public static void main(String[] arrrggggggs)
    {
       playerName();
    }
}
