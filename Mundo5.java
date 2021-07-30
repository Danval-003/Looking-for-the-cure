import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo5 extends MyWorld
{

    /**
     * Constructor for objects of class Mundo5.
     * 
     */
    int base=64;
    int compon;
    int compoe;
    int x=1008;
    int y=720;
    public Mundo5()
    {
        super(800,480,1, 1280,1024);
        addObject(new puerta6(),compox(1), compoy(11)-32);
        addObject(new puerta2(),compox(18),624);
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
    public Mundo5(int score, int lives)
    {
        super(800,480,1, 1280,1024);
        addObject(new puerta6(),compox(1), compoy(11)-32);
        addObject(new puerta2(),compox(18),624);
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
        addObject(new Enfermo1(), compox(12), compoy(1));
        addObject(new Enfermo1(), compox(15), compoy(12));
        addObject(new Enfermo1(), compox(11), compoy(1));
        addObject(new Enfermo1(), compox(7), compoy(1));
        addObject(new Enfermo1(), compox(8), compoy(1));
        addObject(new Enfermo1(), compox(9), compoy(1));
        
        
        }
    public void prepare(){
        for(int i=1;i<7;i++){
        addObject(new Fondo(1), compox(18-i), compoy(1*i));}
        addObject(new Bloqueinvisible(), compox(16), compoy(1));
        addObject(new moneda(), compox(18), compoy(13));
        addObject(new Fondo(4), compox1(16), compoy(11));
        addObject(new bloqueBonus(), compox(11), compoy(7));
        addObject(new bloqueBonus(), compox(10), compoy(8));
        for(int i=1;i<7;i++){
        addObject(new Fondo(1), compox(10-i), compoy(8+i));}
        addObject(new Fondo(2), compox1(11), compoy(11));
        addObject(new Bloqueinvisible(), compox(14), compoy(12));
        for(int i=1;i<3;i++){
        addObject(new Fondo(1), compox(6-i), compoy(0+i));}
        for(int i=1;i<3;i++){
        addObject(new Fondo(1), compox(3-i), compoy(3+i));}
        addObject(new bloqueBonus(), compox(3), compoy(3));
        addObject(new Fondo(2), compox1(5), compoy(4));
        addObject(new Fondo(1), compox(7), compoy(5));
        for(int i=1;i<4;i++){
        addObject(new Fondo(1), compox(6-i), compoy(6+i));}
        addObject(new Fondo(2), compox1(1), compoy(10));
        addObject(new moneda(), compox(1), compoy(1));
        
        
    }
    public void borde(){
        addObject(new Fondo(20),400, -240);
        addObject(new Ladrillo(1),-208, -240);
        addObject(new bloque(16),-208, 240);
        addObject(new bloque(16),1008, 240);
        addObject(new Ladrillo(20),400, 720);
    }
}
