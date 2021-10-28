import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EscapeGame extends World
{
    public static final int WIDTH = 1020;   //breedte instellen v/d rooms
    public static final int HEIGHT = 574;   //hoogte instellen v/d rooms
    public static final int RESOLUTION = 1; //resolutie instellen v/d rooms
    
    private Player player; 
    private BaseRoom CharacSelect; //onthoudt de kamers
    private BaseRoom startRoom;
    private BaseRoom room2;
    private BaseRoom currentRoom; // huidige kamer
    
    public EscapeGame()
    {    
        // Create a new world with WIDTH/RESOLUTION x HEIHT/RESOLUTION cells 
        //with a cell size of RESOLUTION x RESOLUTION pixels.
        super(WIDTH/RESOLUTION, HEIGHT/RESOLUTION, RESOLUTION); 
        
        startRoom = new StartRoom(this);
        room2 = new Room2(this);
        SetRoom(startRoom);
    }
    
    private void SetRoom(BaseRoom room)
    {
        currentRoom = room;
        Greenfoot.setWorld(room);
    }
    
    public void NextRoom()
    {
        if(currentRoom == startRoom)
        {
            SetRoom(room2);
            currentRoom.addObject(Globals.h, 100, 100);
        }
        else
        {
            SetRoom(startRoom);
            currentRoom.addObject(Globals.h, 100, 100);
        }
    }
}
