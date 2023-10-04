/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author aamyr
 */
public class Rectangle extends Shape {
    
    private double Height = 5.0;
    private double Width = 6.2;
    private String color;
    private boolean IsFilled = true;
    
    public double getHeight(){
        
       return Height;
        
    }
    
    public double getWidth() {
        
       return Width;
       
    }
    
    public double getArea(int Height, int Width) {
        
        return Width * Height;
        
    }

    public boolean getArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
          
            
    }
    
    
