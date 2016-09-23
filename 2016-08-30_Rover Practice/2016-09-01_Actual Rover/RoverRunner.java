import java.util.Scanner;
/**
 * Write a description of class RoverRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoverRunner
{
    public static void main(String[] arrrggggggs)
    {
       Scanner user_input = new Scanner(System.in);
       System.out.println("What is your rover's name?");
       String name;
       name = user_input.next();
       System.out.println("Your rover is " + name + ".");
             
       Rover r1 = new Rover(name);
       
       System.out.println(name + " is facing " + face +  ". Should " + name + " turn to the left or right");
       String answer = user_input.nextLine();
       
       r1.move();      
       
      
            }
      
       
    }

