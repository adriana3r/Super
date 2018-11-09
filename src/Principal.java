/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {
    
        public static void main(String[] args) {
          
                Película p1 = new Película ();
        
                System.out.println(p1.nombre);
                System.out.println("Tiene " + p1.salas + " salas.");
                System.out.println("Y una capacidad total de " + p1.butacas + " butacas.");
     
    }
}

