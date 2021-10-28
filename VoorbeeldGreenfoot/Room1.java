import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room1 extends BaseRoom
{
    private int count = 0;
    
    public Room1(EscapeGame escapeGame)
    {
        super(escapeGame);
        setBackground("map0.jpg"); //achtergrond 
        //eigen objecten toevoegen
        addObject(new Greep(), 100, 100);
        addObject(new Greep(), 100, 150);
    }
    
    public void act()
    {
       
    }
}
