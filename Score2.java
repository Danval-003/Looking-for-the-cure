import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score2 extends Interfaz
{
    /**
     * Act - do whatever the Score2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score=0;
    public Score2(int score2)
    {
        updateImage();
        score=score2;
    }
    private void updateImage()
    {
        setImage(new GreenfootImage("PUNTUACIÓN: "+score, 40, Color.BLACK, new Color(1, 40, 30,20)));
    }
    public int add(int punteo){
        score=punteo+score;
        updateImage();
        return score;
    }
}
