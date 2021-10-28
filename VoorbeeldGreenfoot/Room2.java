import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room2 extends BaseRoom
{
    private int count = 0;

    public Room2(EscapeGame escapeGame)
    {
        super(escapeGame);
        setBackground("space.jpg"); //achtergrond
        //eigen objecten toevoegen
        for(int i=0;i<10;i++){
            addObject(new Meteoriet(),getWidth()/2, getHeight()/2);
        }
    }
        

    public void act()
    {

    }
}
