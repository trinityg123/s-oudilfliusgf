import java.util.Scanner;
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
   private String name;
   private int x;
   private int y;
   private int dir; // 0=North, 1=East, 2=South, 3=West
   private boolean isAlive = true;
   
   //constructors
   public Rover(String name)
   {
       this.name = name;
       this.x = 0;
       this.y = 0;
       this.dir = 0;
   }
}
