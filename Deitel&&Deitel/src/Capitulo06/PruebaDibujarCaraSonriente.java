package Capitulo06;

import javax.swing.*;

/**  Fig 6.17: PruebaDibujarCaraSonriente.java
 *  Aplicación de prueba que muestra una cara sonriente.
 *
 * @version 09/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see
 */

public class PruebaDibujarCaraSonriente {
    public static void main(String[] args) {

        DibujarCaraSonriente panel = new DibujarCaraSonriente();
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);
    } // fin de main
} // fin de la clase
