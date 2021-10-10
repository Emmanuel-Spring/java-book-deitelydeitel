package Capitulo07;

/**  Fig 7.6: GraficosBarras.java
 *  Programa para imprimir gráfico de barras
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class GraficoBarras {
    public static void main(String[] args) {

        int arreglo[] = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
        System.out.println("Distribución de calificaiones:");

        // Para cada elemnto del arreglo, imprime una barra del gráfico
        for (int contador = 0; contador < arreglo.length; contador++) {

            // Imprime etiqueta de la barra ("00-09: ", ......  "90-99: ", "100:")
            if (contador == 10) {
                System.out.printf("%5d:", 100 );
            } else {
                System.out.printf("%02d-%02d:",
                        contador * 10, contador * 10 + 9);
            }  // Cerramos el if

            for (int estrellas = 0; estrellas < arreglo [ contador ]; estrellas++)
                System.out.println("*");

            // Imprime barras de asteriscos
            System.out.println();  // iniciamos una nueva línea de salida

        }  //  fin de for externo
    }  // fin de main
}    // fin de la clase
