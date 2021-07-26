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
*Descripcion: Menu de inicio del juego
*Última fecha de modificación: 22 de julio de 2021            
*Universidad del Valle 17 de julio de 2021. Segundo ciclo   
**/

public class Menú extends World
{
  GreenfootSound theme = new GreenfootSound("Menusito.mid");
    /**
     * Constructor for objects of class Menú.
     * 
     */
    public Menú()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850,550,1);
        
    }
    public void act()
    {
    Starts starts = new Starts();
    if(theme.isPlaying()==false){
        theme.playLoop();
        }
    if (Greenfoot.isKeyDown("enter"))
        {
        Greenfoot.setWorld(new Mundo1());
        if(theme.isPlaying()==true){
        theme.stop();
        }
        }
        addObject(starts,559,515);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void start()
    {
        
    }
}
