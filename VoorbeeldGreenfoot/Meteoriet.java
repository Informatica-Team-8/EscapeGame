import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteoriet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteoriet extends Actor
{
    public Meteoriet(){
        setRotation(Greenfoot.getRandomNumber(360));
    }
    /**
     * Act - do whatever the Meteoriet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
    }    
}
