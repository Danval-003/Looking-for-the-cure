import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bloque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bloque extends Solid
{
    /**
     * Act - do whatever the bloque wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bloque() 
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
    public bloque(int tamaño) 
    {
        int estandar = 64;
        estandar = estandar*tamaño;
        GreenfootImage bricks = new GreenfootImage("Untitled 07-20-2021 06-20-06.png");
        GreenfootImage image = new GreenfootImage(64, estandar);
        int w = bricks.getWidth();
        for(int offset=0; offset<estandar; offset+=w) 
        {
            image.drawImage(bricks, 0, offset);
        }
        setImage(image);
    } 
}
