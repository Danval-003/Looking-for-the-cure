import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Interfaz
{
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int lives=3;
    public Vida() 
    {
        update_image();
    } 
    private void update_image(){
        int estandar = 64;
        if (lives>0){
        estandar = estandar*lives;
        GreenfootImage bricks = new GreenfootImage("Untitled 07-22-2021 09-10-01.png");
        GreenfootImage image = new GreenfootImage(estandar, bricks.getHeight());
        int w = bricks.getWidth();
        for(int offset=0; offset<estandar; offset+=w) 
        {
            image.drawImage(bricks, offset, 0);
        }
        setImage(image);}
        else{
        estandar = estandar*1;
        GreenfootImage bricks = new GreenfootImage("Untitled 07-22-2021 09-10-01.png");
        GreenfootImage image = new GreenfootImage(estandar, bricks.getHeight());
        int w = bricks.getWidth();
        setImage(image);
        
        
        }
        
    }
    public void add(int livese){
        lives=livese;
        update_image();
    }
}
