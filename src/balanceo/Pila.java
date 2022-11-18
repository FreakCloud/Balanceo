/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanceo;

/**
 *
 * @author lopez
 */
import java.util.ArrayList;

/**
 *
 * @author lopez
 */
public class Pila <T>{
   ArrayList<T> datos = new ArrayList<>();
    private int top;

    public Pila() {
    }
    
    public void push(T dato){
        datos.add(dato);
        top++;
    }
    
    public int lenght(){
        return this.top;
    }
    
    public boolean isEmpty(){
        return this.datos==null;
    }
    
    public T pop(){
        T dato = datos.remove(top-1);
        top--;
        return dato;
    }
    
    public T peek(){
        T dato = datos.get(top-1);
        return dato;
    }
    
    @Override
    public String toString(){
        String estado = "";
        
        for (T dato : datos) {
            estado += dato + " ->" + " " ;             
        }
        return estado;
    }

    void push(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
