import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Interfaz
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score=0;
    public Score(int score2)
    {
        updateImage();
        score=score2;
    }
    private void updateImage()
    {
        setImage(new GreenfootImage("PUNTUACIÓN: "+score, 20, Color.WHITE, new Color(1, 40, 30,20)));
    }
    public int add(int punteo){
        score=punteo+score;
        updateImage();
        return score;
    }
}
