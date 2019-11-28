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
public class Hilo2 extends Thread{
     protected String text;
     static int vocales;
         String valid = "aeiou";
         String nombre = "Vocales";

        public Hilo2(String text) {
            this.text = text;
        }

        public void run() {
            int count = 0;
            for (char c : text.toCharArray()) {
                for (char d : valid.toCharArray()) {
                    if ((c + "").equalsIgnoreCase(d + "")) {
                        count++;
                    }
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vocales = count;
            System.out.println(nombre + " : " + count);
        }
}
