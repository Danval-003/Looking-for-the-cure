import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MP extends Interfaz
{
    /**
     * Act - do whatever the MP wants to do. This method is called whenever
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
