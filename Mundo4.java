import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo4 extends MyWorld
{

    /**
     * Constructor for objects of class Mundo4.
     * 
     */
    int base=64;
    int compon;
    int compoe;
    int x=1008;
    int y=720;
    public Mundo4()
    {
        super(800,480,1, 1280,1024);
        addObject(new puerta5(),compox(1), compoy(13)-32);
        addObject(new puerta2(),compox(13),624);
        addObject(new puerta2(),944,624);
        setMainActor(new Primer_jugador(), 200,180);
        mainActor.setLocation(compox(13), compoy(1));
        GreenfootImage bg = new GreenfootImage("Mundo1.png");
        setScrollingBackground(bg);
        borde();
        prepare();
        enemigo();
        addObject(new Musica(),128,48, false);
        addObject(new Vida(),128,48, false);
        addObject(new Score(0),128,90, false);
    }
    public Mundo4(int score, int lives)
    {
        super(800,480,1, 1280,1024);
        addObject(new puerta2(),compox(1), compoy(13)-32);
        addObject(new puerta2(),compox(13),624);
        addObject(new puerta2(),944,624);
        setMainActor(new Primer_jugador(), 200,180);
        mainActor.setLocation(compox(13), compoy(1));
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
        addObject(new Enfermo1(), compox(12), compoy(1));
        addObject(new Enfermo1(), compox(10), compoy(1));
        addObject(new Enfermo1(), compox(6), compoy(1));
        addObject(new Enfermo1(), compox(7), compoy(1));
        addObject(new Enfermo1(), compox(10), compoy(12));
        addObject(new Enfermo1(), compox(15), compoy(9));
        addObject(new Enfermo1(), compox(17), compoy(1));
        addObject(new Enfermo1(), compox(16), compoy(1));
        
        
        }
    public void prepare(){
        addObject(new bloque(2), compox(4), compoy(1)-32);
        addObject(new bloque(1), compox(5), compoy(3));
        addObject(new bloque(1), compox(6), compoy(4));
        addObject(new Fondo(2), compox1(8), compoy(5));
        addObject(new Fondo(1), compox(10), compoy(4));
        addObject(new Fondo(2), compox1(12), compoy(3));
        addObject(new Fondo(1), compox(14), compoy(2));
        addObject(new Fondo(1), compox(15), compoy(1));
        addObject(new Fondo(1), compox(15), compoy(5));
        addObject(new Fondo(2), compox1(16), compoy(6));
        addObject(new Fondo(2), compox1(14), compoy(8));
        addObject(new Bloqueinvisible(), compox(16), compoy(9));
        addObject(new Fondo(1), compox(13), compoy(9));
        addObject(new Fondo(1), compox(12), compoy(10));
        addObject(new Fondo(3), compox(10), compoy(11));
        addObject(new Bloqueinvisible(), compox(8), compoy(12));
        addObject(new Bloqueinvisible(), compox(12), compoy(12));
        addObject(new Bloqueinvisible(), compox(13), compoy(1));
        addObject(new Fondo(1), compox(8), compoy(9));
        addObject(new Fondo(1), compox(5), compoy(8));
        addObject(new Fondo(1), compox(4), compoy(9));
        addObject(new Fondo(1), compox(3), compoy(10));
        addObject(new Fondo(1), compox(2), compoy(11));
        addObject(new Fondo(1), compox(1), compoy(12));
        addObject(new moneda(), compox(18), compoy(1));
         
        
        
        
    }
    public void borde(){
        addObject(new Fondo(20),400, -240);
        addObject(new Ladrillo(1),-208, -240);
        addObject(new bloque(16),-208, 240);
        addObject(new bloque(16),1008, 240);
        addObject(new Ladrillo(20),400, 720);
    }
}
