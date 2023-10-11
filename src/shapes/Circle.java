/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author aamyr
 */
public class Circle extends Shape{
    
    private double radius = 2;

    public double getRadius() {
        return radius;
    }
    
    public double getArea(){
        return 3.1416 * radius * radius;
    }
}
