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
public class Conversion {
    private Grados grados;

    public float centigradosAFarenheith(){
        
    
    //metodo logica
    
    float resultado=grados.getCentigrados()*1.8f+32;
    
    return resultado;
    }
    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
    
    private Unidades unidades;
    
    public float piesAMetros(){
        
      //  float resultado =unidades.getMetros()*3.28;
        
  //      return resultado;
   // }
   //  public float getMetros() {
   //     return metros;
   // }

   // public void setMetros(float metros) {
   // //    this.metros = metros;
   // }
//}

