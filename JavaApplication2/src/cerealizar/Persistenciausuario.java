/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerealizar;

import java.io.*;
public class Persistenciausuario {
    public static void guardar(Cliente c) throws Exception{
        //Paso 1 generar el archivo donde se va agurdar el serializado 
        File file=new File("/esteequipo/respaldoe/objetos-1803/archivaldo.yomero");
        
        //indicar que se va a generar 
        FileOutputStream fos=new FileOutputStream(file);
        //escribir un objeto en el
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
    }
}
