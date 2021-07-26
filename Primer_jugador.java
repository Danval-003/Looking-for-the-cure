import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
*Universidad del Valle de Guatemala                           
*11 calle 1579 Zona 15 Vista Hermosa III                     
*Guatemala, C. A.                                             
*Curso: Programación orientada a objetos                      
*Catedrático: Lynette Garcia Perez                               
*Trabajo: Proyecto Juego en Greenfoot
*Autores: Daniel Armando Valdez Reyes|Carné: 21240            
*Sección: 20
*Descripcion: Personaje principal del juego
*Última fecha de modificación: 22 de julio de 2021            
*Universidad del Valle 17 de julio de 2021. Segundo ciclo   
**/

public class Primer_jugador extends Jugadores
{
    /**
     * Act - do whatever the Personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int ySpeed = 0; //this number determines how fast you are moving up and down
    private int xSpeed;
    int accel = 2;
    private int livese;
    int lives=3;
    int anima=0;
    private boolean onGround;
    final int jSpeed = 38;
    boolean poder=false;
    int punteo=0;
    private GreenfootImage imagefrente;
    private GreenfootImage invenImagen;
    private GreenfootImage ImagenR;
    private GreenfootImage ImagenL;
    private GreenfootImage ImagenR2;
    private GreenfootImage ImagenL2;
    private GreenfootImage ImagenR3;
    private GreenfootImage ImagenL3;
    boolean monedit=false;
    boolean monedota=false;
    
    GreenfootSound prueba = new GreenfootSound("Musica batalla.mid");
    public Primer_jugador(){
    xSpeed=0;
    }
    public void act()
    {
        monedas();
        moveVertically();
        invenImagen= new GreenfootImage("Invisible.png");
        imagefrente= new GreenfootImage("Doc1.png");
        ImagenR= new GreenfootImage("DocIz.png");
        ImagenL= new GreenfootImage("DocDer.png");
        ImagenR2= new GreenfootImage("DocIz2.png");
        ImagenL2= new GreenfootImage("Docder2.png");
        ImagenR3= new GreenfootImage("DocIz3.png");
        ImagenL3= new GreenfootImage("DocDer3.png");
        moveHorizontally();
        compruebavida();
        spas();
        if(anima>6) anima=0;
        anima++;
        //prueba.playLoop();
        //prueba.setVolume(43);
        // Add your actio code here.
    }
    public void compruebavida(){
    if (lives <=0){
    Greenfoot.setWorld(new Lose());
    //prueba.stop();
    }
    }
    public void spas(){
    if(Greenfoot.isKeyDown("space")) {poder=true;
        if(Greenfoot.isKeyDown("right"))xSpeed=1;
        if(Greenfoot.isKeyDown("left"))xSpeed=-1;
        setImage(invenImagen);}
    else {poder=false;if(xSpeed==0) setImage(imagefrente);}
    }
    public void monedas(){
        Actor monedita = getOneObjectAtOffset (0, 0, moneda.class);
        if(monedita!=null){
            World mundo;
            mundo=getWorld();
            mundo.removeObject(monedita);
            punteo=punteo+100;
        }
        Actor monedota = getOneObjectAtOffset (0, 0, MP.class);
        if(monedota!=null){
            World mundo;
            mundo=getWorld();
            mundo.removeObject(monedota);
            punteo=punteo+500;
        }
        ((Score) getWorld().getObjects(Score.class).get(0)).add(punteo);
        punteo=0;
    }
    
    public void moveHorizontally()
    {
        setLocation(getX()+xSpeed, getY());
        while (getOneObjectAtOffset (getImage().getWidth()/2, 0, Solid.class) != null)
        {
            setLocation(getX()-1, getY());

            xSpeed = 0;
        }

        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, Solid.class) != null)
        {
            setLocation(getX()+1, getY());

            xSpeed = 0;
        }
        if(poder==false){
            Actor Enfermo1 = getOneObjectAtOffset (getImage().getWidth()/2, 0, Enfermo1.class);
            if(Enfermo1 != null)
                {
                    xSpeed = -26;
                    ySpeed = -27;
                    lives=lives-1;
                    ((Vida) getWorld().getObjects(Vida.class).get(0)).add(lives);
                    return;
                }  
            Actor Enfermo2 = getOneObjectAtOffset (-getImage().getWidth()/2, 0, Enfermo1.class);
            if(Enfermo2 != null){
                    xSpeed = +26;
                    ySpeed = -27;
                    lives=lives-1;
                    ((Vida) getWorld().getObjects(Vida.class).get(0)).add(lives);
                    return;
                }}
        
        if (Greenfoot.isKeyDown("right"))
        {
            if (xSpeed < 0)
            {
                xSpeed = 0;
                setImage(ImagenL);
            }
            if (xSpeed < 4)
            {
                xSpeed = xSpeed +2;
                anul();
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            if (xSpeed > 0)
            {
                xSpeed = 0;
                setImage(ImagenR);
            }
            if (xSpeed > - 4)
            {
                xSpeed = xSpeed -2;
                anur();
            }
            
        }
        if (!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right"))
        {
            xSpeed = 0;
        }
        if (Greenfoot.isKeyDown("up")&& poder==false)
        {
            jump();
            
        }
    }
    public void anur(){
        if (anima<3)setImage(ImagenR2);
        else setImage(ImagenR3);
    }
    public void anul(){
        if (anima<3)setImage(ImagenL2);
        else setImage(ImagenL3);
    }
    private void moveVertically()
    {
        ySpeed= ySpeed+accel;
        setLocation(getX(), getY()+ySpeed/2);
        onGround = false;
        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, Solid.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, Solid.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (-14, getImage().getHeight()/2 - 2, Solid.class)!= null)
        {
            setLocation(getX(), getY()-1);
            onGround = true;
            ySpeed = 0;
        }

        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, Solid.class)!= null)
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
        if (poder==false){
            while (getOneObjectAtOffset (getImage().getWidth()/2, 0, bloqueBonus.class) != null)
            {
            setLocation(getX()-1, getY());

            xSpeed = 0;
        }

        while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, bloqueBonus.class) != null)
        {
            setLocation(getX()+1, getY());

            xSpeed = 0;
        }
            while (getOneObjectAtOffset (getImage().getWidth()/2, 0, bloqueBonus.class) != null)
             {
            setLocation(getX()-1, getY());

            xSpeed = 0;
        }

            while (getOneObjectAtOffset (-getImage().getWidth()/2, 0, bloqueBonus.class) != null)
            {
            setLocation(getX()+1, getY());

            xSpeed = 0;
            }
            while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, bloqueBonus.class)!= null)
            {
                setLocation(getX(), getY()-1);
                onGround = true;
                ySpeed = 0;
            }
    
            while (getOneObjectAtOffset (14, getImage().getHeight()/2 - 2, bloqueBonus.class)!= null)
            {
                setLocation(getX(), getY()-1);
                onGround = true;
                ySpeed = 0;
            }
    
        while (getOneObjectAtOffset (-14, getImage().getHeight()/2 - 2, bloqueBonus.class)!= null)
            {
                setLocation(getX(), getY()-1);
                onGround = true;
                ySpeed = 0;
            }
    
        while (getOneObjectAtOffset (0, -getImage().getHeight()/2+1, bloqueBonus.class)!= null)
            {
                setLocation(getX(), getY()+1);
                ySpeed = 0;
            }
        }
        if(poder==false){
        Actor Enfermo1 = getOneObjectAtOffset (0, getImage().getHeight()/2, Enfermo1.class);
        if(Enfermo1 != null)
            {
                ySpeed = -27;
                lives=lives-1;
                ((Vida) getWorld().getObjects(Vida.class).get(0)).add(lives);
                return;
            }}
    }
    
    private void jump()
    {
        if (onGround == true)
        {
            ySpeed -= jSpeed;
        }
    }
    
}
