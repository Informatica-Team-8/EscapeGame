import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Do what a greep's gotta do.
     */
    public void act()
    {
        move(10);
        //overstappen naar andere wereld
        if (getX()> getWorld().getWidth()-20){
            BaseRoom wereld = (BaseRoom) getWorld();
            wereld.NextRoom();
        }
             
    }
}
