/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ulukbek
 */
public class Circle extends Shape {

    public Circle(double centerX, double centerY, double side) {
        super(centerX, centerY, side);
    }
    
    // Calculations for Circle
    @Override
    public double calculateBoxArea(){
        
        return (side*2)*(side *2);// width * height
    }
    
}
