import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundoprueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundoprueba extends MyWorld
{

    /**
     * Constructor for objects of class Mundoprueba.
     * 
     */
    public Mundoprueba() {
        super(850,550,1, 3800,2100);
        setMainActor(new Primer_jugador(), 400,200 );
        mainActor.setLocation(-1300, 500);
        GreenfootImage bg = new GreenfootImage("Vector-design-city-skyscrapers-night_3840x2160.jpg");
        setScrollingBackground(bg);
        addObject(new Ladrillo(), -1330, 700);
        addObject(new Ladrillo(), -1010, 700);
        addObject(new Ladrillo(), -690, 700);
        addObject(new borde_izquie(),-498, 700);
        addObject(new Fondo(), -690, 732);
        addObject(new Fondo(), -1330, 732);
        addObject(new Fondo(), -1010, 732);
        addObject(new Fondo(), -690, 764);
        addObject(new Fondo(), -1330, 764);
        addObject(new Fondo(), -1010, 764);
        addObject(new Fondo(), -690, 796);
        addObject(new Fondo(), -1330, 796);
        addObject(new Fondo(), -1010, 796);
        
    }
}
