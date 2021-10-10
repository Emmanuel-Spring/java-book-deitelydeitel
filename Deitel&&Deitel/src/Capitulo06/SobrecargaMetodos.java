package Capitulo06;

/**  Fig 6.13: PruebaSobrecargaMetodos.java
 *  Declaracion de métodos sobrecargados
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class SobrecargaMetodos {

    // Pureba los métodos cuadrado sobrecargados
    public  void probarMetodosSobrecargados() {
        System.out.printf("El cuadrado del entero 7 es %d\n", cuadrado(7));
        System.out.printf("El cuadrado del double 7.5 es %f\n", cuadrado(7.5));
    }  // fin del método probarMetodosSobrecargados


    // método cuadrado con argumento int
    public int cuadrado(int valorInt) {

        System.out.printf("\nSe llamó a cuadrado con argumento int: %d\n", valorInt);

        return valorInt * valorInt;

    }  // fin del método cuadrado con argumento int


    // método cuadrado con argumento double
    public double cuadrado (double valorDouble) {

        System.out.printf("\nSe llamó a cuadrado con argumento double: %f\n", valorDouble);
        return valorDouble * valorDouble;
    } // fin del método cuadrado con argumento double
}  // fin de la clase
