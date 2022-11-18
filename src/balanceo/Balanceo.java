/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanceo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
/**
 *
 * @author lopez
 */
public class Balanceo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         FileReader archivo; 
        BufferedReader lector;
        int contador =0;
        
        try{
            archivo = new FileReader("c:\\texto1.txt");
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while((cadena= lector.readLine()) != null){
                    Pila<String> pila = new Pila<>();
                    
                    for(int i=0; i<cadena.length(); i++){
                        if(cadena.charAt(i)=='('){
                            pila.push('(');
                            contador ++;
                        } else { if(cadena.charAt(i)==')') {
                            pila.pop();
                            contador ++; 
                        } 
                        }
                    }
                    if(pila.isEmpty() & contador%2==0){
                        System.out.print("Correcto");
                    } else System.out.print("InCorrecto");
                    
                    
                    
                }
            } else { 
                System.out.println("El archivo no fue encontrado");
            }
        }
        
        
        
        
    }
    
}
