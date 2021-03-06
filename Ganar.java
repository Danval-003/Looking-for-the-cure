import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganar extends World
{
    GreenfootSound theme = new GreenfootSound("Menusito.mid");  
    /**
     * Constructor for objects of class Ganar.
     * 
     */
    public Ganar(int score)
    {    
        super(850,550,1);
        addObject(new Score2(score),440,400);
    }

    public Ganar()
    {    
        super(850,550,1);
        addObject(new Score2(0),440,400);
    }

    public void act()
    {
        if(theme.isPlaying()==false){
            theme.playLoop();
        }
        if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Menú());
            if(theme.isPlaying()==true){
                theme.stop();
            }
        }
    }
}
