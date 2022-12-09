/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication41;

import java.util.Scanner;

/**
 *
 *
 *
 *
 * @author user
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String black = "\033[30m";
        String red = "\033[31m";
        String green = "\033[32m";
        String yellow = "\033[33m";
        String blue = "\033[34m";
        String purple = "\033[35m";
        String cyan = "\033[36m";
        String white = "\033[37m";
        String reset = "\u001B[0m";
        boolean salir = true;
        int menupricipal;

        String titulo = purple + "***************WIKI HEARTHSONE**************+ \n" + reset;

        do {
            System.out.println(titulo);
            System.out.println(cyan + "1)Juego" + cyan + " \n2)Cartas" + cyan + " \n3)Conjuntos" + red + "\n4)Salir" + reset);
            menupricipal = teclado.nextInt();
            switch (menupricipal) {
                case 1:
                    System.out.println(green + "1)Que es herthStone" + green + " \n2)Como jugar?" + green + " \n3)Maneras de jugar?" + green + "\n4)Heroes" + red + "\n5)Volver al menu anterior" + reset);
                    int menujuego = teclado.nextInt();
                    switch (menujuego) {
                        case 1:
                            System.out.println("");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:

                    }

                    break;
                default:
                    throw new AssertionError();
            }

        } while (menupricipal == 4);
    }

}
