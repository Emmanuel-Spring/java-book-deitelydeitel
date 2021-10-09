package Capitulo06;

import java.util.Scanner;

/**  Fig 6.3: BuscadorMaximo.java
 *   Método máximo, declarado por el programador
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class BuscadorMaximo {


    // Determina tres valores de punto flotante y determinar el mayor de estos números
    public void determinarMaximo() {

        // Crea el objeto Scanner para introducir datos desde la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        // Pide y recibe tres números de punto flotante
        System.out.println("Escriba tres valores de punto flotante, separados por espacios: ");
        double numero1 = entrada.nextDouble();  // Lee el primer número
        double numero2 = entrada.nextDouble();  // Lee el segundo número
        double numero3 = entrada.nextDouble();  // Lee el tercer número

        // Detrminar el valor máximo
        double resultado = maximo(numero1, numero2, numero3);

        // Muestra el valor del número máximo
        System.out.println("El máximo es:  " + resultado);
    } // fin del método determinarMaximo()

    // Devuelve el máximo de susu tres valores
    public double maximo(double x, double y, double z) {
        double valorMaximo = x;

        // Determinar si y es mayor que valorMaximo (x)
        if (y > valorMaximo) {
            valorMaximo = y;
        }

        // Determinar si z es mayor que valorMaximo (x)
        if (z > valorMaximo) {
            valorMaximo = z;
        }

        return valorMaximo;
    } // Fin del método máximo
} //  Fin de la clase BuscadorMaximo
