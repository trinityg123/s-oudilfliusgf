
/**
 * Write a description of class Rover_Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Rover_Runner
{        
    
    public static void main(String args[]){
        // Make a Scanner
        SimpleScanner input = new SimpleScanner();
        
        System.out.println("What is your rover's name?");
        String name;
        name = input.readString();
        System.out.println("Your rover is " + name + ".");
        
        Rover r1 = new Rover(name);
        boolean running = true;
        int power = 100;
        String exitCommand = "quit";
        int run = 0;
        boolean alive = true;
        int rover2Health = 100;
        
        System.out.println();
        System.out.println("_________________________________________________");
        System.out.println("                 Commands");
        System.out.println("     move: To move a distance forward.");
        System.out.println("           right: to turn right.");
        System.out.println("            left: to turn left.");
        System.out.println("         picture: to take a picture.");
        System.out.println("          quit: to stop the program.");
        System.out.println("        charge: to charge your rover.");
        System.out.println("transmit: to transmit pictures back to earth.");
        System.out.println("to earth: to have your rover return to earth.");
        System.out.println("_________________________________________________");
        System.out.println();
        
        while (running) {
            run += 1;
            System.out.println(run);
            if  (run >= 5){
                while (alive){
                    int health = 100;
                    if (health <= 0){
                     System.out.println(name + " has been killed.");
                     alive = false;
                    }
                    System.out.println(name + " has found another rover.");
                    System.out.println("Should " + name + " fight or help this rover.");
                        
                    String rover2 = input.readString();
                    if (rover2.equals("fight")){
                        System.out.println(name + " has started fighting the second rover.");
                        System.out.println("What attack should " + name + " use?");
                        System.out.println("_________________________");
                        System.out.println("         Attacks");
                        System.out.println( "lazers: to shoot lazers");
                        System.out.println("     stare: to stare");
                        System.out.println("  throw: to throw rocks");
                        System.out.println("___________________________");
                        String attack = input.readString();
                        if (attack.equals("lazers")){
                              rover2Health -= 35;
                              System.out.println(name + "has damaged the other rover by 35.");
                              System.out.println("The rover's health is now " + rover2Health + ".");
                              r1.otherRobot();
                        }
                        else if (attack.equals("stare")){
                              rover2Health -= 35;
                              System.out.println(name + "has damaged the other rover by 5.");
                              System.out.println("The rover's health is now " + rover2Health + ".");
                              r1.otherRobot();
                        }
                        else if (attack.equals("throw")){
                              System.out.println(name + "has damaged the other rover by 15.");
                              System.out.println("The rover's health is now " + rover2Health + ".");
                              r1.otherRobot();
                        }
                    }
                    else if (rover2.equals("help")){
                        System.out.println("wp9e8trp[owfey");
                    }
                }
            }
            System.out.println(name + " is " + power + " percent charged.");
            System.out.println();
                if (power <= 0){
                    System.out.println(name + " has run out of power.");
                    running = false;
                }
                else{
                    System.out.println("Enter a command:");
                    String command = input.readString();
                    
                        if(command.equals("move")){
                            power -= 25;
                            r1.move();
                            System.out.println(name + " moved.");
                            System.out.println();
                        }
                        else if(command.equals("right")){
                            r1.rotateRight();
                            System.out.println();
                        }
                        else if(command.equals("left")){
                            r1.rotateLeft();
                            System.out.println();
                        }
                        else if(command.equals("picture")){
                            power -= 15;
                            System.out.println("____________________________________");
                            System.out.println("             Filters");
                            System.out.println("             hipster");
                            System.out.println("        black and white");
                            System.out.println("            no filter");
                            System.out.println("____________________________________");
                            System.out.println("What filter would you like to use?");
                            System.out.println();
                            String filter = input.readString();
                                if (filter.equals("hipster")){
                                    r1.takePicture();
                                    System.out.println("while using the " + filter + " filter.");
                                    System.out.println();
                                }
                                else if (filter.equals("black and white")){
                                    r1.takePicture();
                                    System.out.println("while using the " + filter + " filter.");
                                    System.out.println();
                                }
                                else if (filter.equals("no filter")){
                                    r1.takePicture();
                                    System.out.println("while using the " + filter + " filter.");
                                    System.out.println();
                                }
                                else{
                                    System.out.println("Not a vaild filter name.");
                                    System.out.println();
                                }
                        }
                        else if (command.equals("transmit")){
                            r1.transmitPictures();
                            System.out.println();
                        }
                        
                        else if(command.equals("charge")){
                            power = 100;
                            System.out.println(name + "has charged to " + power + " percent.");
                            System.out.println();
                        }
                        else if (command.equals("to earth")){
                            System.out.println("Are you sure you want " + name + " to return to earth?");
                            String answer = input.readString();
                            if (answer.equals("yes")){
                                r1.toEarth();
                                System.out.println();
                                running = false;
                            }
                            else{
                                System.out.println(name + " did not return to earth.");
                                System.out.println();
                            }
                        }
                        else if(command.equals("quit")){
                            running = false;
                            System.out.println();
                        }
                        else{
                            System.out.print("Invalid Command");
                            System.out.println();
                        }
            }
        }
        System.out.println("Goodbye");
    }
}
