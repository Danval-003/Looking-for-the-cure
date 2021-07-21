import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo extends Solid
{
    /**
     * Act - do whatever the Fondo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Fondo() 
    {
        GreenfootImage bricks = new GreenfootImage("Untitled 07-20-2021 06-20-06.png");
        GreenfootImage image = new GreenfootImage(320, bricks.getHeight());
        int w = bricks.getWidth();
        for(int offset=0; offset<320; offset+=w) 
        {
            image.drawImage(bricks, offset, 0);
        }
        setImage(image);
    }   
}
