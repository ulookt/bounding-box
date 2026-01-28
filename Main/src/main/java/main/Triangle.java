/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ulukbek
 */
public class Triangle extends Shape {

    public Triangle(double centerX, double centerY, double side) {
        super(centerX, centerY, side);
    }
    
    // Calculations for Triangle
    @Override
    public double calculateBoxArea(){
        
        return side*side*Math.sqrt(3)/2;
    }
    
}
