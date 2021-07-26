import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puerta1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puerta1 extends Puertas
{
    /**
     * Act - do whatever the puerta1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int scor;
        if (Greenfoot.isKeyDown("space")){
             Actor Enfermo1 = getOneObjectAtOffset (getImage().getWidth()/2, 0, Primer_jugador.class);
            if(Enfermo1 != null)
                {
                    scor=((Score) getWorld().getObjects(Score.class).get(0)).add(0);
                    Greenfoot.setWorld(new Mundo2(scor));
                }  
            Actor Enfermo2 = getOneObjectAtOffset (0, 0, Primer_jugador.class);
            if(Enfermo2 != null){
                    scor=((Score) getWorld().getObjects(Score.class).get(0)).add(0);
                    Greenfoot.setWorld(new Mundo2(scor));
                }
            
            
        }
    }
}
