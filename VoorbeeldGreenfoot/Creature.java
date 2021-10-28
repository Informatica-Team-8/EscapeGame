import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.List;

/**
 * A Creature is the base class for all alien beings in this scenario. It
 * provides the basic abilities of creatures in this world.
 * Simplified 
 * 
 * @author Michael Kolling
 * @version 1.0
 */
public abstract class Creature extends Actor
{
    private static final double WALKING_SPEED = 5.0;
   
    /** Indicate whether we have a tomato with us */
    private boolean carryingTomato = false;
    private boolean atWater = false;
   
      
   
    
    /**
     * Turn 'angle' degrees towards the right (clockwise).
     */
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    

   
    
    /**
     * Move forward roughly in the current direction. 
     */
    public void move()
    {
        
        double angle = Math.toRadians( getRotation() );
        int x_vorig=getX();
        int y_vorig=getY();
        
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        
             
        setLocation(x,y);  //gaat nooit uit de wereld
        
        //je kan niet in het water stappen - keer terug naar vorige positie
        /*if(((Earth)getWorld()).isWater(getX(), getY())) {  
            atWater = true;
            setLocation(x_vorig, y_vorig);
 
        }
        else {
            atWater = false;
        }     */
            
      
    }
    
    
    /**
     * Return true if we have just seen water in front of us.
     */
    public boolean atWater()
    {
        return atWater;
    }
    
    
    /**
     * Load a tomato onto *another* creature. This works only if there is another creature
     * and a tomato pile present, otherwise this method does nothing.
     */
    public final void loadTomato()
    {
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        // check whether there's another creature here
        Creature greep = (Creature) getOneIntersectingObject(Creature.class);

        if(greep != null && tomatoes != null) {
            if(!greep.carryingTomato()) {
                tomatoes.takeOne();
                greep.carryTomato();
            }
        }
    }

           
    /**
     * Check whether we are carrying a tomato.
     */
    public final boolean carryingTomato()
    {
        return carryingTomato;
    }
        
    /**
     * Remove the tomato currently carried (and return true). Return
     * false if we were not carrying one.
     */
    public final boolean removeTomato()
    {
        if (carryingTomato) {
            dropTomato();            
            return true;
        }
        else
            return false;
    }
    

    /**
     * Receive a tomato and carry it.
     */
    private void carryTomato()
    {
        carryingTomato = true;
        setImage(getCurrentImage());
    }

    /**
     * Drop the tomato we are carrying. 
     * If not, it's just gone...
     */
    public void dropTomato()
    {
        if(!carryingTomato)
            return;           
       
        carryingTomato = false;
        setImage(getCurrentImage());
    }

    

    
    /**
     * This method must be defined in subclasses. It gives subclasses the chance
     * to specify their own images.
     */
    abstract protected String getCurrentImage();

    
    /**
     * Test if we are close to one of the edges of the world. Return true if we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 3 || getX() > getWorld().getWidth() - 3)
            return true;
        if(getY() < 3 || getY() > getWorld().getHeight() - 3)
            return true;
        else
            return false;
    }

    
    
   
}
