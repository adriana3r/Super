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
          
                Largometraje l1 = new Largometraje ();
        
                System.out.println(l1.nombre);
                System.out.println("Tiene " + l1.salas + " salas.");
                System.out.println("Y una capacidad total de " + l1.butacas + " butacas.");
     
    }
}

