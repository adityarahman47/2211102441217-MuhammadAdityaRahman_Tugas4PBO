import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game_over extends World
{

    /**
     * Constructor for objects of class game_over.
     * 
     */
    public game_over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1);
        prepare();
    }
    
    private void prepare()
    {
        try_again try_again = new try_again();
        addObject(try_again,406,198);
        try_again.setLocation(138,159);
        try_again.setLocation(456,231);
        try_again.setLocation(436,226);
        try_again.setLocation(446,192);
        try_again.setLocation(444,232);
        try_again.setLocation(417,229);
    }
}
