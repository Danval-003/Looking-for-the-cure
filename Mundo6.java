import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo6 extends MyWorld
{

    /**
     * Constructor for objects of class Mundo6.
     * 
     */
    int base=64;
    int compon;
    int compoe;
    int x=1008;
    int y=720;
    public Mundo6()
    {
        super(800,480,1, 1280,1024);
        addObject(new puerta2(),compox(18),624);
        for(int i=1; i<18;i++){
            addObject(new bloqueBonus(), compox(i), compoy(3));
        }
        for(int i=1; i<17;i++){
            addObject(new bloqueBonus(), compox(i), compoy(2));
            addObject(new bloqueBonus(), compox(i), compoy(1));
        }
        setMainActor(new Primer_jugador(), 200,180);
        mainActor.setLocation(compox(18), 656);
        GreenfootImage bg = new GreenfootImage("Mundo1.png");
        setScrollingBackground(bg);
        borde();
        prepare();
        enemigo();
        addObject(new Musica(),128,48, false);
        addObject(new Vida(),128,48, false);
        addObject(new Score(0),128,90, false);
    }
    public Mundo6(int score, int lives)
    {
        super(800,480,1, 1280,1024);
        addObject(new puerta2(),compox(18),624);
        for(int i=1; i<18;i++){
            addObject(new bloqueBonus(), compox(i), compoy(3));
        }
        for(int i=1; i<17;i++){
            addObject(new bloqueBonus(), compox(i), compoy(2));
            addObject(new bloqueBonus(), compox(i), compoy(1));
        }
        addObject(new MP(), compox(1), compoy(1));
        setMainActor(new Primer_jugador(), 200,180);
        mainActor.setLocation(compox(18), 656);
        GreenfootImage bg = new GreenfootImage("Mundo1.png");
        setScrollingBackground(bg);
        borde();
        prepare();
        enemigo();
        addObject(new Musica(),128,48, false);
        addObject(new Vida(lives),128,48, false);
        addObject(new Score(score),128,90, false);
    }
    public int compoy(int fila){
        compon=fila*base;
        compon=y-compon;
        return compon;
    }
    public int compox(int columna){
        compoe=columna*base;
        compoe=x-compoe;
        return compoe;
    }
    public int compox1(int columna){
        compoe=columna*base;
        compoe=x-compoe-32;
        return compoe;
    }
    public void enemigo(){
        addObject(new Enfermo1(), compox(17), compoy(4));
        addObject(new Enfermo1(), compox(15), compoy(4));
        addObject(new Enfermo1(), compox(13), compoy(4));
        addObject(new Enfermo1(), compox(11), compoy(4));
        addObject(new Enfermo1(), compox(9), compoy(4));
        addObject(new Enfermo1(), compox(7), compoy(4));
        addObject(new Enfermo1(), compox(5), compoy(4));
        }
    public void prepare(){
        addObject(new Fondo(1), compox(18), compoy(4));
        addObject(new Fondo(2), compox1(16), compoy(6));
        addObject(new Fondo(1), compox(14), compoy(8));
        addObject(new Fondo(2), compox1(10), compoy(8));
        addObject(new Fondo(1), compox(7), compoy(8));
        addObject(new Fondo(2), compox1(4), compoy(6));
        addObject(new Fondo(1), compox(2), compoy(5));
        addObject(new Fondo(1), compox(1), compoy(8));
        addObject(new Fondo(2), compox1(3), compoy(10));
        addObject(new Fondo(5), compox(9), compoy(12));
        addObject(new Vacuna(), compox(9), compoy(13));
        
    }
    public void borde(){
        addObject(new Fondo(20),400, -240);
        addObject(new Ladrillo(1),-208, -240);
        addObject(new bloque(16),-208, 240);
        addObject(new bloque(16),1008, 240);
        addObject(new Ladrillo(20),400, 720);
    }
}
