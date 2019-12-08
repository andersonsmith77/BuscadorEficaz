/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorEficaz;

/**
 *
 * @author Smith
 */

public class MetodosDeBusqueda {
    
    public static String posicion1;
    public static String numero = "";
    
    public  static void busquedaSecuencial(int []arreglo,int dato){
    int posicion = -1;    
    posicion1 = "";
    for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
        if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
    // posicion = i;//Si es verdadero guardamos la posicion
    //  break;//Para el ciclo
      posicion1 = posicion1 + i + ","; 
        }
    }
} 
   
    public  static void busquedaSecuencialString(String []arreglo, String dato){
    int posicion = -1;
    posicion1 = "";
        for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
            if(dato.equals(arreglo[i])){//comparamos el elemento en el arreglo con el buscado
    // posicion = i;//Si es verdadero guardamos la posicion
    //  break;//Para el ciclo
     posicion1 = posicion1 + i + ","; 
            }
        }
    }
 
    public static int busquedaBinaria(int vector[], int dato){ 
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
    
    public static int busquedaInterpolacion(int[] integers, int ElementoABuscar) {
    int IndiceDeComienzo = 0;
    int UltimoIndice = (integers.length - 1);
    while ((IndiceDeComienzo <= UltimoIndice) && (ElementoABuscar >= integers[IndiceDeComienzo]) &&
           (ElementoABuscar <= integers[UltimoIndice])) {
        int posicion = IndiceDeComienzo + (((UltimoIndice-IndiceDeComienzo) /
          (integers[UltimoIndice]-integers[IndiceDeComienzo]))*
                        (ElementoABuscar - integers[IndiceDeComienzo]));
        if (integers[posicion] == ElementoABuscar)
            return posicion;
        if (integers[posicion] < ElementoABuscar)
            IndiceDeComienzo = posicion + 1;
        else
            UltimoIndice = posicion - 1;
        }
    return -1;
    }
}
