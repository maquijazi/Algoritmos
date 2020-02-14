package algoritmosordenacion;

import java.util.Arrays;

/**
 *
 * @author jahaziel
 */
public class AlgoritmosOrdenacion {

    public void ordenacionBurbuja(int[] numeros) {
        //El metodo recibe un array de números para ordenarlos mediante el método de la burbuja
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - 1; i++) {//El length-1 es para no comparar el ultimo numero con una posicion que no existe
                if (numeros[i] > numeros[i + 1]) {
                    //Si se cumple intercambio los valores de i, y de i+1
                    int aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
    }
    
    int [] lista1 = {13,558,42,99,155,3};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Dejado el mainclass para ser usado como algoritmo de consola
        AlgoritmosOrdenacion ordenacion = new AlgoritmosOrdenacion();
        
        System.out.println("lista sin ordenadar:"+Arrays.toString(ordenacion.lista1));
        
        ordenacion.ordenacionBurbuja(ordenacion.lista1);
        
        System.out.println("lista ordenada:"+Arrays.toString(ordenacion.lista1));
    }

}
