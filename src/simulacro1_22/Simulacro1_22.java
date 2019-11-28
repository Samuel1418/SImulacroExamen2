/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro1_22;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Simulacro1_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        String palabra=JOptionPane.showInputDialog("Introduce una palabra");
        Hilo1 h1= new Hilo1(palabra);
        Hilo2 h2= new Hilo2(palabra);
        Hilo3 h3= new Hilo3();
        
        h1.start();
        h2.start();
        h1.join();
        h2.join();
        h3.start();
        h3.join();
        System.out.println("El programa acabo!");
    }
    
}
