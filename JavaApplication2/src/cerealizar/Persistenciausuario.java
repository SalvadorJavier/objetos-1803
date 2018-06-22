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
        File file=new File("archivaldo.yomero");
        
        //indicar que se va a generar 
        FileOutputStream fos=new FileOutputStream(file);
        //escribir un objeto en el
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
    }
    public static Cliente leer ()throws Exception{
        //para leer primero ponemos el archivo
        File file=new File("archivaldo.yomero");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Cliente c=(Cliente)ois.readObject();
    return c;
    }
        
    
}
