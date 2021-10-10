package Capitulo06;

import java.util.Random;

/**  Fig 6.9: Craps.java
 *  La clase Craps simula un juego de dados "craps".
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class Craps {

    // Crea un generador de numeros aleatorios para usarlo en el método tirarDado
    private Random numerosAleatorios = new Random();

    // Enumeracion con constantes que representan el estado del juego
    private enum Estado {CONTINUA, GANO, PIERDO} ;

    //   Constantes que representan tiros comunes de los dados
    private final static int DOS_UNOS = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;

    // Ejecuta ell metodo juego de craps
    public void jugar() {

        int miPunto = 0; // Punto si no gana o pierde en el primer tiro
        Estado estadoJuego;

        int sumaDeDados = tirarDados();  // primer tiro de dados


        switch (sumaDeDados) {

            case SIETE: // Gana con SIETE en le primer tiro
            case ONCE: // Gana con ONCE en le primer tiro
                    estadoJuego = Estado.GANO;
                    break;

            case DOS_UNOS:  // pierde con DOS en el primer tiro
            case TRES:  // pierde con TRES en el primer tiro
            case DOCE:  // pierde con DOCE en el primer tiro
                estadoJuego = Estado.PIERDO;
                break;

            default: // No ganó ni perdió, por lo que guarda el punto

                estadoJuego = Estado.CONTINUA;  // No hatermonado el juego
                miPunto = sumaDeDados; // Guarda el punto
                System.out.printf("El punto es de %d\n", miPunto);
                break;  // Opcional fin del switch
        }  // fin del switch

        // Mientras el juego no esté terminado
        while (estadoJuego == Estado.CONTINUA) {  // No ganó ni perdió
            sumaDeDados = tirarDados();  // tirar dados de nuevo

            // determina el estado del juego
            if (sumaDeDados == miPunto) {
                estadoJuego = Estado.GANO;
            } else {
                if (sumaDeDados == SIETE)  // pierde al tirar el 7 antes del punto
                    estadoJuego = Estado.PIERDO;
            }  // fin de while
        }  /// llaves aqui


            if (estadoJuego == Estado.GANO) {
                System.out.println("El jugador Gana !!!");
            } else {
                System.out.println("El jugadoir pierde !!!  Lo sentimos.");
            }
        }  // fiun del método juego

        // tirar los dados, calcular la suma de la muestra de los resultados
        public int tirarDados() {
            int dado1 = 1 + numerosAleatorios.nextInt(6);  // Primer tiro del dado
            int dado2 = 1 + numerosAleatorios.nextInt(6);  // Primer tiro del dado

            int suma = dado1 + dado2;  // sumna de los valores de los dados

            // Muestra los resultados de esteb tiro
            System.out.printf("El jugador tiró %d + %d = %d\n",
                    dado1, dado2, suma);

            return suma;  // devuelve la suma de los dados
    }  // Fin del método tirarDados()
}  //  Final de la clase Craps
