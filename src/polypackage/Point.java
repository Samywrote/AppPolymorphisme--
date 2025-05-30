/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polypackage;

/**
 *
 * @author dell
 */
public class Point {
    // Les variables d'instance
    
    protected int x,y;
    
    // Les constructeurs

    public Point() {
        this.x=0;
        this.y=0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getters and Setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public void deplacer (int dx,int dy){
        this.x+=dx;
        this.y+=dy;
    }
    
    
    public String afficher (){
        return "("+this.x+","+this.y+")";
    }
}
