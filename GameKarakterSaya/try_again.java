import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class try_again here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class try_again extends Actor
{
    /**
     * Act - do whatever the try_again wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public try_again()
    {
        GreenfootImage img = this.getImage();
        img.scale(350,450);
        this.setImage(img);
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
        getImage().scale((int)Math.round(getImage().getWidth()*0.9),
        (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mousePressed(this)){
        Greenfoot.delay(5);
        Greenfoot.setWorld(new MyWorld());
        }
        
    }
}
