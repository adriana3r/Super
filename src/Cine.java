/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cine {
        
        public String nombre;
        public int salas;
        public int butacas;
        
        
        public Cine(String nombre, int salas, int butacas){
                
                this.nombre = nombre;
                this.salas = salas;
                this.butacas = butacas;
                                
                System.out.println("Constructor de superclase");
        }
}
