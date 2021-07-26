import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class Lost extends Letras
{
    int animatio=0;
    /**
     * Act - do whatever the Lost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound theme = new GreenfootSound("Musica perdiste.mid");
    public void act()
    {
        theme.playLoop();
        mover();
        theme.setVolume(37);
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

    private void mover()
    {
    if(animatio<20){
    setLocation(getX()+1, getY()+2);
    animatio++;
    dilaySegundo();
    }
}
private static void dilaySegundo(){
    try{
        Thread.sleep(20);
    }catch(InterruptedException e){}

}
    }
