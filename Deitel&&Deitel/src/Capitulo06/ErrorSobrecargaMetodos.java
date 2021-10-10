package Capitulo06;

/**  Fig 6.15: ErrorSobrecargaMetodos.java
 *  Los métodos sobrecargados con firmas idénticas producen errores de
 *  compilación, aun si los tipos de valores de retorno son distintos
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class ErrorSobrecargaMetodos {

    // Declaración del método cuadrado con argumento int
    public int cuadrado( int x ) {

        return x * x;
    }

    // La segunda declaración del método cuadrado con argumento int producen un error
    // de compilación, aun cuando los tipos de valores de retorno son distintos
    public  double cuadradoo( int y ) {

        return  y * y;
    }
} // fin de la clase ErrorSobrecargaMetodos
