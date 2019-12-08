/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorEficaz;

/**
 *
 * @author Rafael
 */
public class ConvertirVectores {
    public static String ACadena(int [] Vector){
        String resultado = "";
        for(int i = 0;i<Vector.length;i++){
            if(i == 0){
                resultado = ""+Vector[i];
            }
            else{
                resultado+=","+Vector[i];
            }
        }
        return resultado;
    }
    public static int[] AVectorEntero(String cadena){
        int[] vector;
        String[] v = cadena.split(",");
        vector = new int[v.length];
        for(int i = 0; i < v.length ; i++){
            vector[i] = Integer.parseInt(v[i]);
        }
        return vector;
    }
}
