package specialpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author CSchafer
 */
public class Ball {
   private int width, x, y, vy,vx;
   private Rectangle bounds;
   private Color color;
    
    public Ball(int cWidth, int cHeight){
       this.x = cWidth/2;
       this.y = cHeight /2;
       this.width = 30;
       this.vy = 5;
       this.vx = -7;
       this.color = Color.blue;
       this.bounds = new Rectangle(this.x, this.y, this.width, this.width); 
    }
    public void draw(Graphics g){
       g.setColor(this.color);
       Graphics2D g2d = (Graphics2D) g; 
       g2d.draw(bounds);
       g2d.fillOval(x,y,width,width);  
    }
    public void update(){
        this.x += vx;
       this.y += vy;
       this.bounds = new Rectangle(this.x, this.y, this.width, this.width);
    }
    public void bounce(){
    double ran1 = Math.random();
    double ran2 = Math.random();
    this.vx = -this.vx;
    this.vy = -this.vy;
    
    move();
    move();
    move();
    move();
    }
        //movment
    public void move(){
        this.x +=vx;
        this.y +=vy;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
   
}
