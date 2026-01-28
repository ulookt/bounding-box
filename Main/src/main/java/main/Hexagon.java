/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ulukbek
 */
public class Hexagon extends Shape {

    public Hexagon(double centerX, double centerY, double side) {
        super(centerX, centerY, side);
    }
    
    // Calculations for Hexagon
    @Override
    public double calculateBoxArea(){
        
        return 2*Math.sqrt(3)*side*side;
    }
    
}
