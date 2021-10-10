package Capitulo06;

import java.util.Random;

/**  Fig 6.7: EnterosAleatorios.java
 *  Enteros aleatorios desplazados y escalados
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class EnterosAleatorios {
    public static void main(String[] args) {

        Random numerosAleatorios = new Random();  // Generador de números enteros aleatorios
        int cara;  // Almacena cada entero aleatorio generado

        for (int contador = 1; contador <= 200; contador++) {
            cara = 1 + numerosAleatorios.nextInt(6);

            System.out.printf("%d ", cara);  // Muestra el valor generado

            // Si contador es divisible entre 5, empieza una nueva línea de salida
            if (contador % 10 == 0)
                System.out.println();
        } // fin de for
    }  // fin de main
} // fin de la clase EnterosAleatorios
