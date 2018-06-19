/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerealizar;

/**
 *
 * @author T-101
 */
public class Apicacion {
    public static void main(String[] args)throws Exception{
        
        Cliente c=new Cliente();
        c.setEdad(26);
        c.setNombre("salvador");
        c.setSueldo(45000);
        
        Persistenciausuario.guardar(c);
        System.out.println("guardado con exito");
        
    }
}
