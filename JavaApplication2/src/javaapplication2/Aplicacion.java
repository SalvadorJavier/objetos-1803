/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author T-101
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        //crear un objeto de tipo grados 
        Grados g=new Grados();
        //a este objeto le asignamos un valor a su atributo centigrados 
        g.setCentigrados(20);
        
        //creamos un objeto de la clase convesion
        Conversion c=new Conversion();
        c.setGrados(g);
        //aplicar el modelo 
       
                System.out.println(c.centigradosAFarenheith());
    }
}
