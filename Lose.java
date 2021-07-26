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
*Descripcion: pantalla del juego perdido
*Última fecha de modificación: 22 de julio de 2021            
*Universidad del Valle 17 de julio de 2021. Segundo ciclo   
**/

public class Lose extends World
{

    /**
     * Constructor for objects of class Lose.
     * 
     */
    GreenfootSound theme = new GreenfootSound("Musica perdiste.mid");
    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850,550,1);
        getBackground().setColor(new Color(30,30,30));
        getBackground().fill();
        prepare();
    }
        /**
         * Prepare the world for the start of the program.
         * That is: create the initial objects and add them to the world.
         */
        private void prepare()
        {
            Lost lost = new Lost();
            addObject(lost,425,220);
            //lost.setLocation(452,280);
            //lost.setLocation(456,280);
    
    }

}

