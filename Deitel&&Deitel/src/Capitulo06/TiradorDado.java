package Capitulo06;

import java.util.Random;

/**  Fig 6.8: TiradorDado.java
 *  tirar un dado de 6 lados 6000 veces
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class TiradorDado {
    public static void main(String[] args) {

        Random numerosAleatorios = new Random();

        int frecuencia1 = 0; // Cuenta de veces que se tiró 1
        int frecuencia2 = 0; // Cuenta de veces que se tiró 2
        int frecuencia3 = 0; // Cuenta de veces que se tiró 3
        int frecuencia4 = 0; // Cuenta de veces que se tiró 4
        int frecuencia5 = 0; // Cuenta de veces que se tiró 5
        int frecuencia6 = 0; // Cuenta de veces que se tiró 6

        int cara; // Almacena el valor que se tiró más recientemente

        for (int tiro = 1; tiro <= 6000; tiro++) {

            cara = 1 + numerosAleatorios.nextInt(6);

            switch (cara) {
                case 1:
                    ++frecuencia1;
                    break;
                case 2:
                    ++frecuencia2;
                    break;
                case 3:
                    ++frecuencia3;
                    break;
                case 4:
                    ++frecuencia4;
                    break;
                case 5:
                    ++frecuencia5;
                    break;
                case 6:
                    ++frecuencia6;
                    break;
            }  // Fin fr switch
        }  // fin de for

        System.out.println("Cara \t\tFrecuencia");  // Encabezados de salida
        System.out.printf("1\t\t\t%d\n2\t\t\t%d\n3\t\t\t%d\n4\t\t\t%d\n5\t\t\t%d\n6\t\t\t%d\n",
                frecuencia1, frecuencia2, frecuencia3, frecuencia4, frecuencia5, frecuencia6);
    }  // fin del main
  } //  fin de la clase TirarDado

