import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;
/**
 * Write a description of class ObjectSpecial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectSpecial extends Actor
{
    private GreenfootSound collectSound = new 
    GreenfootSound("Collect.mp3");
    
    public ObjectSpecial() {
        setImage("object.png");
        GreenfootImage img = this.getImage();
        img.scale(60,60);
        this.setImage(img);
        collectSound = new GreenfootSound("CollectCoin.mp3");
    }
    public void act()
    {
        checkForCollision();
        move(-8);
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    
    }
    
    public void checkForCollision() {
        Actor character = getOneIntersectingObject(Character.class);
        if (character != null) {
            ((Character) character).increaseScore();
            getWorld().removeObject(this);
            Greenfoot.playSound("Collect.mp3");
        }
    }
    
    public void playCollectSound(){
        collectSound.play();
    }
}
