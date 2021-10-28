import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EscapeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EscapeGame extends World
{
    public static final int RESOLUTION = 1;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    private Man man; //voor alle rooms
    private BaseRoom room1; //onthoudt de rooms
    private BaseRoom room2;
    private BaseRoom currentRoom; //de huidige room
    public EscapeGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH / RESOLUTION, HEIGHT / RESOLUTION, RESOLUTION);
        //initialiseer de kamers   
        room1 = new Room1(this); //geeft EscapeGame mee
        room2 = new Room2(this);
        SetRoom(room1);

        man = new Man(); //wordt 1 keer aangemaakt en toegevoegd
        currentRoom.addObject(man,500,100);
    }

    private void SetRoom(BaseRoom room)
    {
        currentRoom = room;
        Greenfoot.setWorld(room);
    }

    public void NextRoom()
    {
        if(currentRoom == room1)
        {
            SetRoom(room2);
            //plaats de man op de gewenste positie
            currentRoom.addObject(man,getWidth()/41, getHeight()-100);
        }
        else
        {
            SetRoom(room1);
            //plaats de man op de gewenste positie
            currentRoom.addObject(man,100,100);
        }
    }
}
