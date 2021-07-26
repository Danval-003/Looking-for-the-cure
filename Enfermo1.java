import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
*Universidad del Valle de Guatemala                           
*11 calle 1579 Zona 15 Vista Hermosa III                     
*Guatemala, C. A.                                             
*Curso: Programación orientada a objetos                      
*Catedrático: Lynette Garcia Perez                               
*Trabajo: Proyecto Juego en Greenfoot
*Autores: Daniel Armando Valdez Reyes|Carné: 21240            
*Sección: 20
*Descripcion: Clase de enemigo simple del juego
*Última fecha de modificación: 22 de julio de 2021            
*Universidad del Valle 17 de julio de 2021. Segundo ciclo   
**/

public class Enfermo1 extends Enemigos
{
    /**
     * Act - do whatever the Enfermo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int stability; //stores how much health the Enfermo has
    private GreenfootImage imageL;
    private GreenfootImage imageR;
    private int ySpeed = 0; //this number determines how fast you are moving up and down
    private int xSpeed;
    int accel = 3;
    boolean salto = true;
    private boolean onGround;
    final int jSpeed = 45;
    private int imageChangeTime; //defines how long to wait before the image changes
    private int imageChangeDelayCount; //ticks up to change the image
    private boolean imminentDeath; //determines if the Enfermos is about to die
    private boolean hitEdge = false; //initialize value for hitEdge. Determines whether the Enfermo has hit the edge
    private boolean change;
    public Enfermo1(){
        imageL = new GreenfootImage("121221.png");
        imageR = new GreenfootImage("zombie_n_skeleton2qsdad.png");
        setImage(imageL);
        stability = 1;
        change=false;
        //imageChangeTime = 5;
        //imageChangeDelayCount = 0;
    }
    public void act()
    {
        moveEnfermo();
        switchImage();
    }
    public void moveEnfermo()
    {
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Solid.class) != null)
        {
            setLocation(getX()-4, getY());
            move(-2);
            hitEdge=false;
            change=true;
        }

        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Solid.class) != null)
        {
            setLocation(getX()+4, getY());
            hitEdge=true;
            change=true;
            move(2);
        }
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Bloqueinvisible.class) != null)
        {
            setLocation(getX()-4, getY());
            move(-2);
            hitEdge=false;
            setImage(imageL);
        }

        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Bloqueinvisible.class) != null)
        {
            setLocation(getX()+4, getY());
            hitEdge=true;
            setImage(imageR);
            move(2);
        }
        ySpeed= ySpeed+accel;
        setLocation(getX(), getY()+ySpeed/2);
        onGround = false;
        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, Bloqueinvisible.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, Bloqueinvisible.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (-14, getImage().getHeight()/2 - 2, Bloqueinvisible.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, Bloqueinvisible.class)!= null)
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
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
        if (hitEdge == false)
        {
            move(-3/2);
        }
        else if (hitEdge == true)
        {
            move(3/2);
        }
        
    }
    public void hit(int damage) 
    {
        stability = stability - damage;
        if(stability <= 0) 
        {
            getWorld().removeObject(this);
        }
    }
    public void switchImage()
    {
        if(change)
        {
            if(getImage() == imageL)
            {
                setImage(imageR);
                change=false;
            }
            else
            {
                setImage(imageL);
                change=false;
            }
        }
    }
}
