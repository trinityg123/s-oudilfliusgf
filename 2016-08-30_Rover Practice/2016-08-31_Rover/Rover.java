
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
    // fields
    private String name;
    private int x;
    private int y;
    private int dir; // 0=North, 1=East, 2=South, 3=West
    private boolean isAlive = true;
    
    
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
        if (isAlive) 
        {
            if (dir == 0)
            {
                y += 1;
            }
            else if (dir == 1)
            {
                x += 1;
            }
            else if (dir == 2)
            {
                y -= 1;
            }
            else 
            {
                x -= 1;
            }
            
            System.out.println(name + " moved in direction " + dir);
        }
        else 
        {
            System.out.println(name + " can't move. It's dead!");
        }
    }
    
    public void rotateLeft() 
    {
        dir -= 1;
        
        if (dir < 0)
        {
            dir = 3;
        }
        
        System.out.println(name + " turned to the left");        
    }
    
    public void rotateRight()
    {
        dir += 1;
        
        if (dir == 4)
        {
            dir = 0;
        }
        
        System.out.println(name + " turned to the right"); 
        System.out.println("is facing " + dir);
    }
    
    public void kill(Rover other)
    {
        System.out.println(this.name + " kills " + other.name + " with his space lasers.");
        other.die();
    }
    
    public String toString() 
    {
        return "Rover[name=" + name + ", x=" + x + 
               ", y=" + y + ", dir=" + dir + ", isAlive=" + isAlive + "]";
    }
}
