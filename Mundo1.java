import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo1 extends MyWorld
{

    /**
     * Constructor for objects of class Mundo1.
     * 
     */
    int base=64;
    int compon;
    int compoe;
    int x=1008;
    int y=720;
    public Mundo1()
    {
        super(800,480,1, 1280,1024);
        addObject(new puerta1(),compox(1), compoy(10)-32);
        addObject(new puerta2(),compox(1), compoy(13)-32);
        addObject(new puerta2(),944,624);
        setMainActor(new Primer_jugador(), 200,180);
        mainActor.setLocation(944, 656);
        GreenfootImage bg = new GreenfootImage("Mundo1.png");
        setScrollingBackground(bg);
        borde();
        prepare();
        enemigo();
        addObject(new Musica(),128,48, false);
        addObject(new Vida(3),128,48, false);
        addObject(new Score(0),128,90, false);
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
        addObject(new Enfermo1(), compox(8), compoy(1));
        addObject(new Enfermo1(), compox(7), compoy(1));
        addObject(new Enfermo1(), compox(5), compoy(1));
        addObject(new Enfermo1(), compox(14), compoy(1));
        addObject(new Enfermo1(), compox(16), compoy(1));
        addObject(new Enfermo1(), compox(18), compoy(1));
        addObject(new Enfermo1(), compox(3), compoy(13));
        addObject(new Enfermo1(), compox(4), compoy(13));
    
        }
    public void prepare(){
        addObject(new Bloqueinvisible(), compox(5), compoy(1));
        addObject(new Fondo(2),compox1(4),compoy(2));
        addObject(new Fondo(2), compox1(7), compoy(3));
        addObject(new Fondo(), compox(10), compoy(4));
        addObject(new Fondo(), compox(11), compoy(5));
        addObject(new Fondo(2), compox1(12), compoy(6));
        addObject(new Fondo(), compox(15), compoy(7));
        addObject(new Fondo(), compox(16), compoy(8));
        addObject(new Fondo(2), compox1(13), compoy(10));
        addObject(new Fondo(2), compox1(9), compoy(10));
        addObject(new Fondo(2), compox1(5), compoy(9));
        addObject(new Fondo(3), compox(2), compoy(9));
        addObject(new Fondo(6), compox1(3), compoy(12));
        addObject(new bloque(2), compox(6), compoy(13)-32);
        addObject(new Bloqueinvisible(), compox(2), compoy(14));
        addObject(new Bloqueinvisible(), compox(2), compoy(13));
        addObject(new Fondo(2), compox1(17), compoy(12));
        addObject(new moneda(), compox(18), compoy(10));
        addObject(new MP(), compox(18), compoy(13));
        addObject(new MP(), compox(5), compoy(13));
        
        
        
    }
    public void borde(){
        addObject(new Fondo(20),400, -240);
        addObject(new Ladrillo(1),-208, -240);
        addObject(new bloque(16),-208, 240);
        addObject(new bloque(16),1008, 240);
        addObject(new Ladrillo(20),400, 720);
    }
}
