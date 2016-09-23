
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
    // fields
    String name;
    private int x;
    private int y;
    private int dir;// 0=North, 1=East, 2=South, 3=West
    private int distance;
    boolean running = true;
    private int pics;
    String face;
    
    public Rover(String name)
    {
        this.name = name;
        this.dir = 0;
    }
    
    //gets direction name from an integer
    public void getDirectionName()
    {
        if (dir == 0)
        {
            face = "North";
        }
        else if (dir == 1)
        {
            face = "North East";
        }
        else if (dir == 2)
        {
            face = "East";
        }
        else if (dir == 3)
        {
            face = "South East";
        }
        else if (dir == 4)
        {
            face = "South";
        }
        else if (dir == 5)
        {
            face = "South West";
        }
        else if (dir == 6)
        {
            face = "West";
        }
        else if (dir == 7)
        {
            face = "North West";
        }
        else{
            System.out.println("ahIOSDUGAOFIUSG");
        }
    }
    
    //changes the x and y coordinates
    public void move()
    {
        if (running) 
        {          
            System.out.println(name + " is facing " + dir);
        }
        else 
        {
            System.out.println(name + " can't move. It's dead!");
        }
    }
    
    //rotates the rover in the left direction
    public void rotateLeft() 
    {
        dir -= 1;
        
        if (dir < 0)//has the rover change direction so it is not negative
        {
            dir = 7;
        }
        
        System.out.println(name + " turned to the left");
        getDirectionName();
        System.out.println(name + " is facing " + face);
        move();
    }
    
    //rotates the rover in the right direction
    public void rotateRight()
    {
        dir += 1;
        
        if (dir == 8)//has the rover change direction so the value does not go over 8
        {
            dir = 0;
        }
        
        System.out.println(name + " turned to the right");
        getDirectionName();
        System.out.println(name + " is facing " + face);
        move();
    }
    
    //has the rover take a picture
    public void takePicture(){
        this.pics += 1;
        System.out.println(name + " has taken " + pics + " picture");
    }
    
    //sets the number pf pictures back to 0
    public void transmitPictures(){
        System.out.println(name + " has sent all pictures back to earth.");
        this.pics = 0;
        System.out.println(name + " has taken " + pics + " picture since last transmit.");
    }
    
    public void otherRobot(){
        int damage = Math.random;
        System.out.println("The rover has damaged " + name + " by " + damage + " percent.");
    }
    //has the rover go to earth and end the program
    public void toEarth(){
        System.out.println(name + "returned to earth safely.");
    }
        
}
