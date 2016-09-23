
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover {
    
    // fields
    private String name;
    private int x;
    private int y;
    private int dir; // 0=North, 1=East, 2=South, 3=West
    private boolean isAlive = true;
    
    
    // constructor(s)
    public Rover(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }
    
    
    // helper functions - private, possible useful for abstraction of public methods
    private void die() {
        isAlive = false;
        System.out.println(name + " goes 'aaaaaakkkkk!' and dies.");
    }
    
    
    // mutator methods - change the state of the object
    public void move(int distance) {
        if (isAlive) {
            if (dir == 0) {
                y += distance;
            }
            else if (dir == 1) {
                x += distance;
            }
            else if (dir == 2) {
                y -= distance;
            }
            else {
                x -= distance;
            }
            
            System.out.println(name + " moved in direction " + dir);
        }
        else {
            System.out.println(name + " can't move. It's dead!");
        }
    }
    
    public void rotateLeft() 
    {
        dir -= 1;
        
        if (dir < 0) {
            dir = 3;
        }
        
        System.out.println(name + " turned to the left");        
    }
    
    public void rotateRight()
    {
        dir += 1;
        
        if (dir == 4) {
            dir = 0;
        }
        
        System.out.println(name + " turned to the right");        
    }
    
    public void kill(Rover other) {
        System.out.println(this.name + " kills " + other.name + " with his space lasers.");
        other.die();
    }
    
    
    // accessor methods - just for looking, state doesn't change
    public String getName() {
        return name;
    }
    
    public String toString() {
        return "Rover[name=" + name + ", " +
               "x=" + x + ", " +
               "y=" + y + ", " + 
               "dir=" + dir + ", " + 
               "isAlive=" + isAlive + "]";
    }
}
