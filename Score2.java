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
        score=score2;
        updateImage();
        
    }
    private void updateImage()
    {
        GreenfootImage Scorer= new GreenfootImage("PUNTUACIÓN: "+score, 40, Color.BLACK, new Color(1, 40, 30,20));
        GreenfootImage vacuna= new GreenfootImage("Untitled 07-19-2021 12-47-29.png");
        int w= Scorer.getWidth();
        GreenfootImage image = new GreenfootImage(w+128, vacuna.getHeight());
        image.drawImage(Scorer, 0, 32);
        image.drawImage(vacuna, w, 0);
        setImage(image);
        
    }
    public int add(int punteo){
        score=punteo+score;
        updateImage();
        return score;
    }
}
