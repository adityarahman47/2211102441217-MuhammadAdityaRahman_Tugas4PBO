import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(){
        GreenfootImage img = this.getImage();
        img.scale(100,130);
        this.setImage(img);
    }
    public void act()
    {
        move(-6);
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
