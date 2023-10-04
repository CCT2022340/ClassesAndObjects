/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Triangle;

/**
 *
 * @author aamyr
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();
        
        int[] sideLenghts = new int[18];
        // The lengths of tri1`s sides will be first, then tri2`s sides, etc...
        
        sideLenghts[0] = 5;
        sideLenghts[1] = 8;
        sideLenghts[2] = 9;

        sideLenghts[12] = 4;
        sideLenghts[13] = 7;
        sideLenghts[14] = 2;
        //set the middle side of each triangle to be 3.
        
        sideLenghts[1] = 3;
        sideLenghts[4] = 3;
        sideLenghts[7] = 3;
        sideLenghts[10] = 3;
        sideLenghts[13] = 3;
        sideLenghts[16] = 3;
        
        Person israel = new Person();
        israel.favTriangle = tri5;
        
    }
    
}
