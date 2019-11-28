/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro1_22;

/**
 *
 * @author Samuel
 */
public class Hilo3 extends Thread{
    public void run(){
        System.out.println("El numero total de letras es: "+(Hilo1.consonantes+Hilo2.vocales));
    }
}
