import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class moneda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moneda extends Interfaz
{
    /**
     * Act - do whatever the moneda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage ImagenR;
    private GreenfootImage ImagenL;
    private GreenfootImage ImagenR2;
    
    int animacion=0;
    public void act()
    {
        ImagenR= new GreenfootImage("monedafrente.png");
        ImagenL= new GreenfootImage("monedaATRAS.png");
        ImagenR2= new GreenfootImage("monedaintermedia.png");
        ImagenR2.scale(14/3,48);
        ImagenR.scale(48,48);
        ImagenL.scale(48,48);
        if(animacion==80)animacion=0;
        if (animacion>=40 && animacion<60 ){
            setImage(ImagenL);
        }else if(animacion<40 && animacion>=20){
            setImage(ImagenR2);
        }else if(animacion<80 && animacion>=60){
            setImage(ImagenR2);
        }else{
            setImage(ImagenR);
        }
        animacion++;
    }
}
