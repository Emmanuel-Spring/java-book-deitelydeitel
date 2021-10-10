package Capitulo07;

/**  Fig 7.5: SumaArreglo.java
 *  Cálculo de la suma de los elmentos de un arreglo
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */
public class SumaArreglo {
    public static void main(String[] args) {


        int arreglo [] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // Suma del valor de cada elemento al total
        for (int contador = 0; contador < arreglo.length; contador++)
            total += arreglo[ contador ];

        System.out.printf("Total de los elemtos del arreglo: %d\n", total);
    }  // fin del main
}  // fin de la clase SumaArreglo
