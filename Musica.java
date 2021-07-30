import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musica extends Actor
{
    /**
     * Act - do whatever the Musica wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean playing=true;
    GreenfootSound prueba = new GreenfootSound("Musica batalla.mid");
    public void musicon(boolean play){
        playing=play;
        if(play==false){
            prueba.stop();
        }
    }
    public void act()
    {
     if (playing){prueba.playLoop();playing=false;}
     prueba.setVolume(43);
     GreenfootImage image = new GreenfootImage(64, 64);
     setImage(image);
    }
    
}
