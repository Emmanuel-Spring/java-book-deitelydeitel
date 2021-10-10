package Capitulo07;

/**  Fig 7.4: InicArreglo.java
 *  Cálculos de los valores a colocar en los elementos de un arreglo
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class InicArreglo {
    public static void main(String[] args) {

        final int LONGITUD_ARREGLO = 10;   // declara la constante
        int arreglo[] = new int[LONGITUD_ARREGLO];  // creamos el arreglo

        // Calcula el vfalor de cada elemento del arreglo
        for (int contador = 0; contador < arreglo.length; contador++)
            arreglo[contador] = 2 + 2 * contador;

            System.out.printf("%s%8s\n", "Indice", "Valor");  // Encabezados de la columna

            // Imprime el valor de cada elemnto del arreglo
            for (int contador = 0; contador < arreglo.length; contador++) {
                System.out.printf("%s%8s\n", contador, arreglo[contador]);
            } // fin del for
        }  // fin de main
    }

