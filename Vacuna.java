import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vacuna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vacuna extends Interfaz
{
    /**
     * Act - do whatever the Vacuna wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int scor;
    public void act()
    {
        Actor personaje = getOneObjectAtOffset (0, 0,Primer_jugador.class);
        if(personaje!=null){
            scor=((Score) getWorld().getObjects(Score.class).get(0)).add(0);
            ((Musica) getWorld().getObjects(Musica.class).get(0)).musicon(false);
            Greenfoot.setWorld(new Ganar(scor));

        }
    }
}
