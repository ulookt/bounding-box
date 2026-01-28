/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ulukbek
 */
public class Square extends Shape{

    public Square(double centerX, double centerY, double side) {
        super(centerX, centerY, side);
    }
    
    // Calculations for Square
    @Override
    public double calculateBoxArea(){
        
        return side*side;
    }
    
}
