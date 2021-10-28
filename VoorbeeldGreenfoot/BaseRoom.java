import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BaseRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseRoom extends World
{
    public static final int RESOLUTION = 1;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    protected EscapeGame escapeGame;

    public BaseRoom(EscapeGame escapeGame)
    {    
        super(WIDTH / RESOLUTION, HEIGHT / RESOLUTION, RESOLUTION);
        this.escapeGame = escapeGame;
    }

    public void NextRoom()
    {
        escapeGame.NextRoom();
    }                
}
