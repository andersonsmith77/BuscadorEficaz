/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorEficaz;

/**
 *
 * @author gerson
 */
public class BusquedaInterpolacion {
    
    public static int BusquedaInterpolacion(int[] integers, int ElementoABuscar) {
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
