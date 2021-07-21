import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Primer_jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Primer_jugador extends Jugadores
{
    /**
     * Act - do whatever the Personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean fell = false;
    int saltos = 0;
    private int ySpeed = 0; //this number determines how fast you are moving up and down
    private int xSpeed;
    int accel = 3;
    int speed = 8;
    boolean salto = true;
    private boolean onGround;
    final int jSpeed = 45;
    public Primer_jugador(){
    fell=false;
    xSpeed=0;
    }
    public void act()
    {
        moveVertically();
        moveAround();
        // Add your actio code here.
    }
    public void moveAround()
    {
             
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-speed,getY());
        }
          
    if(Greenfoot.isKeyDown("right"))
        {
            
            setLocation(getX() +speed,getY());
        }
    if (Greenfoot.isKeyDown("up"))
        {
            jump();
        }
    
    
}
    private void moveVertically()
    {

        ySpeed= ySpeed+accel;
        setLocation(getX(), getY()+ySpeed/2);
        onGround = false;

        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, Solid.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, Solid.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (-14, getImage().getHeight()/2 - 2, Solid.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, Solid.class)!= null)
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
    }
    private void jump()
    {
        if (onGround == true)
        {
            ySpeed -= jSpeed;
        }
    }
    
}
