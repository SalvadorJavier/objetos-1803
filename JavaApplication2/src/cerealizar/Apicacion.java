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
        
       //Cliente c=Persistenciausuario.leer();
      //System.out.println("vamosa checar el nombre"+c.getNombre());
      
      for(Cliente c:Persistenciausuario.leer()){
        System.out.println("nombre"+.getNombre());
    }
      /*
       Cliente c=new Cliente();
        c.setNombre("pedro");
        c.setEdad(25);
        Persistenciausuario.guardar(c);
*/
    }
}
