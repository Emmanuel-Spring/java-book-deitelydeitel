package Capitulo06;

/**  Fig 6.11: Alcance.java
 *  La clase Alcance demuestra los alcances de los campos y las variables locales
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class Alcance {

    // Campo accesible para todos los métodos de esta clase
    private int x = 1;

    public void iniciar() {

        int x = 5;

        System.out.printf("la x local del método iniciar es %d\n", x);

        usarVariableLocal();  // usarVariableLocal tiene la x local
        usarCampo();  // usarCampo usa el campo x de la clase Alcance
        usarVariableLocal();  // usarVariableLocal reinicia a la x local
        usarCampo();  // el campo x de la clase Alcance retiene su valor

        System.out.printf("\nla x local en el método iniciar es %d\n", x);
    }

    public void usarVariableLocal () {

        int x = 25;

        System.out.printf("\nla x local al entrar al método usarVariableLocal es %d\n", x);
        ++x;

        System.out.printf("\nla x local antes de salir del método usarVariableLocal es %d\n", x);

    } // fin del método usarVariableLocal

    // Modifica el campo x de la clase Alcance durante cada llamada
    public void usarCampo () {

        System.out.printf("\nel campo x al entrar al método usarCampo es %d\n", x);
        x *= 10;
        System.out.printf("el campo x antes de salir del método usarCampo es %d\n ", x);
    }  // fin del método usarCampo
}  // fin de la clase Alcance
