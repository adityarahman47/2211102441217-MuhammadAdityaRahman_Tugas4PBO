import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        GreenfootImage img = new GreenfootImage("Sky_800x600.jpg");
        prepare();
    }
    
    private void prepare()
    {
        Character character = new Character();
        addObject(character,311,365);
        character.setLocation(82,222);
        character.setLocation(60,274);
    }
    
    public void act (){
            if(Greenfoot.getRandomNumber(100)<1){
            addObject(new Enemy(),853,Greenfoot.getRandomNumber(479));
        }
            if(Greenfoot.getRandomNumber(100)<1){
            addObject(new ObjectSpecial(),853,Greenfoot.getRandomNumber(479));
        }
    }
}

