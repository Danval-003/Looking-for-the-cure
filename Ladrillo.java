import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ladrillo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladrillo extends Solid
{
   
    private boolean changed = false; //determines whether or not the brick's image has been changed to suit the world it is in
    
    
    /**
     * Creates a long brick in the world which is the length of 5 bricks. Has same mechanics as brick, it is just easier to place.
     */
    public Ladrillo() 
    {
        GreenfootImage bricks = new GreenfootImage("Ladrillo base.png");
        GreenfootImage image = new GreenfootImage(320, bricks.getHeight());
        int w = bricks.getWidth();
        for(int offset=0; offset<320; offset+=w) 
        {
            image.drawImage(bricks, offset, 0);
        }
        setImage(image);
    }  
    public Ladrillo(int tamaño) 
    {
        int estandar = 64;
        estandar = estandar*tamaño;
        GreenfootImage bricks = new GreenfootImage("Ladrillo base.png");
        GreenfootImage image = new GreenfootImage(estandar, bricks.getHeight());
        int w = bricks.getWidth();
        for(int offset=0; offset<estandar; offset+=w) 
        {
            image.drawImage(bricks, offset, 0);
        }
        setImage(image);
    } 
    
    /**
     * This will change the image of the brick to the grey castle brick if the world is worldFour or the BossWorld
     * Eliminates the need for extra coding by making a new class for the grey brick.
     */
    public void act()
    {
        
    }
}
