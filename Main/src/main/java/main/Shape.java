/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ulukbek
 */
public abstract class Shape {
    protected double centerX;
    protected double centerY;
    protected double side;

    public Shape(double centerX, double centerY, double side) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.side = side;
    }
    
    public abstract double calculateBoxArea();
    
    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    

    
}
