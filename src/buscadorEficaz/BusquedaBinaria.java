/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorEficaz;

/**
 *
 * @author CT7-PC19
 */
public class BusquedaBinaria {
    
    public static String numero = "";
   
    public static int busquedaBinaria(int  vector[], int dato){ 
        int n = vector.length; 
        int centro,inf=0,sup=n-1; 
        while(inf<=sup){    
            centro=(sup+inf)/2;    
            if(vector[centro]==dato){        
                int i = centro;         
                int j = centro;            
                numero = numero + i + ",";                      
                while(vector[i+1]==dato){             
                    i++;             
                    numero = numero + i + ",";         
                }        
                while(vector[i-1]==dato){            
                    i--;            
                    numero = numero + i + ",";          
                }        
                return centro;    
            }     
            else if(dato < vector[centro] ){       
                sup=centro-1;    
            }     
            else{      
                inf=centro+1;    
            }
        }
        return -1;
    } 
}
