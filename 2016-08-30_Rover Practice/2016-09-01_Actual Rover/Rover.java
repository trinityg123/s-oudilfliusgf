import java.util.Scanner;
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


/**
    public String getCharged(int charge)
    {
        if (isAlive)
        {
            
        }
        else
        {
            System.out.println("Your rover, " + name + " is dead.";
        }
    }
    */
public class Rover
{
    // fields
    private String name;
    private int x;
    private int y;
    private int dir; // 0=North, 1=south, 2=east, 3=West, 4= north east, 5= south east, 6 = south west,7 = north west
    private boolean isAlive = true;
    private int charge = 5;
    private boolean mile = true;
    public String face = "North";
        
    
    // constructor(s)
    public Rover(String name)
    {
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }
    
    
    // helper functions
    private void die()
    {
        isAlive = false;
        System.out.println(name + " goes 'aaaaaakkkkk!' and dies.");
    }
    
    // methods - stuff the Rover can do
    
    public void move()
    {
          int c = 0;
          while (c <= 8){
              
            
              if (answer.equals("right"))
              {
                  dir += 1;
                      
                  Direction();            
               }
           
              else if (answer.equals("left"))
              {
                  dir -= 1;
                      if (dir < -3)
                       {
                         dir = 4;
                       }
                  
                  Direction();
                }
          c += 1;
        }
        System.out.println("You are just going around in circles! Move somewhere.");
    }
    
    public void Direction(){
            if (dir == 0){
                System.out.println(name + " is facing North.");
                String face = "North";
                
                Scanner user_input = new Scanner(System.in);
                System.out.println("Is this the direction you would like " + name + " to move in.");
                String answer;
                answer = user_input.next();
                
                    if (answer.equals("yes")){
                       System.out.println("How many miles would you like " + name + " to move.");
                       
                       int b = user_input.nextInt();
                       System.out.println(name + " moved " + b + " miles.");
                       move();
                    }
                   else if (answer.equals("no")){
                       move();
                    }
                    
            }
            
            else if (dir == 1){
                System.out.println(name + " is facing North East.");
                String face = "North East";
                
                Scanner user_input = new Scanner(System.in);
                System.out.println("Is this the direction you would like " + name + " to move in.");
                String answer;
                answer = user_input.next();
                    if (answer.equals("yes")){
                       System.out.println("How many miles would you like " + name + " to move.");
                       
                       int b = user_input.nextInt();
                       System.out.println(name + " moved " + b + " miles.");
                       move();
                    }
                   else if (answer.equals("no")){
                       move();
                    }
                    
            }
            
            else if (dir == 2){
                System.out.println(name + " is facing East.");
                String face = "East";
                
                Scanner user_input = new Scanner(System.in);
                System.out.println("Is this the direction you would like " + name + " to move in.");
                String answer;
                answer = user_input.next();
                    if (answer.equals("yes")){
                       System.out.println("How many miles would you like " + name + " to move.");
                       
                       int b = user_input.nextInt();
                       System.out.println(name + " moved " + b + " miles.");
                       move();
                    }
                   else if (answer.equals("no")){
                       move();
                    }
                    
            }
            
            else if (dir == 3){
                System.out.println(name + " is facing South East.");
                String face = "South East";
                
                Scanner user_input = new Scanner(System.in);
                System.out.println("Is this the direction you would like " + name + " to move in.");
                String answer;
                answer = user_input.next();
                    if (answer.equals("yes")){
                       System.out.println("How many miles would you like " + name + " to move.");
                       
                       int b = user_input.nextInt();
                       System.out.println(name + " moved " + b + " miles.");
                       move();
                    }
                   else if (answer.equals("no")){
                       move();
                    }
                    
            }
            
            else if (dir == 4){
                System.out.println(name + " is facing South.");
                String face = "South";
                
                Scanner user_input = new Scanner(System.in);
                System.out.println("Is this the direction you would like " + name + " to move in.");
                String answer;
                answer = user_input.next();
                    if (answer.equals("yes")){
                       System.out.println("How many miles would you like " + name + " to move.");
                       
                       int b = user_input.nextInt();
                       System.out.println(name + " moved " + b + " miles.");
                       move();
                    }
                   else if (answer.equals("no")){
                       move();
                    }
                    
            }
            
            else if (dir == -3){
                System.out.println(name + " is facing South West.");
                String face = "South West";
                
                Scanner user_input = new Scanner(System.in);
                System.out.println("Is this the direction you would like " + name + " to move in.");
                String answer;
                answer = user_input.next();
                    if (answer.equals("yes")){
                       System.out.println("How many miles would you like " + name + " to move.");
                       
                       int b = user_input.nextInt();
                       System.out.println(name + " moved " + b + " miles.");
                       move();
                    }
                   else if (answer.equals("no")){
                       move();
                    }
                    
            }
            
            else if (dir == -2){
                System.out.println(name + " is facing West.");
                String face = "West";
                
                Scanner user_input = new Scanner(System.in);
                System.out.println("Is this the direction you would like " + name + " to move in.");
                String answer;
                answer = user_input.next();
                    if (answer.equals("yes")){
                       System.out.println("How many miles would you like " + name + " to move.");
                       
                       int b = user_input.nextInt();
                       System.out.println(name + " moved " + b + " miles.");
                       move();
                    }
                   else if (answer.equals("no")){
                       move();
                    }
                    
            }
            
            else{
                System.out.println(name + " is facing North West");
                String face = "North West";
                
                Miles();                    
            }
             
    }
   
    public String Miles(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Is this the direction you would like " + name + " to move in.");
        String answer;
        answer = user_input.next();           
        System.out.println("How many miles would you like " + name + " to move.");
        if (answer.equals("yes")){                      
            int b = user_input.nextInt();
            System.out.println(name + " moved " + b + " miles.");
            move();
        }
    
        else if (answer.equals("no")){
            move();
        }
    }

    
    public String toString() 
    {
        return "Rover name=" + name + ", x=" + x + 
               ", y=" + y + ", dir=" + dir + ", isAlive=" + isAlive + "]";
    }
    

}
    
