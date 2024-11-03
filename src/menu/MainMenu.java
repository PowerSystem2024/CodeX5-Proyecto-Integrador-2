import agenda.Agenda;
import banco.Banco;
import calculadora.Calculadora;
import ppt.PiedraPapelTijeras;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("+===========================+");
            System.out.println("|      MENU DE CELULAR      |");
            System.out.println("+===========================+");
            System.out.println("| 1. Banco                  |");
            System.out.println("|                           |");
            System.out.println("| 2. Calculadora            |");
            System.out.println("|                           |");
            System.out.println("| 3. Agenda                 |");
            System.out.println("|                           |");
            System.out.println("| 4. Convertidor            |");
            System.out.println("|                           |");
            System.out.println("| 5. Piedra Papel Tijera    |");
            System.out.println("|                           |");
            System.out.println("| 6. Apagar Celular         |");
            System.out.println("|                           |");
            System.out.println("+===========================+");;

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nAbriendo Banco...");
                    Banco banco = new Banco(10000); // Saldo inicial
                    banco.mostrarMenu();
                    break;

                case 2:
                    System.out.println("\nAbriendo Calculadora...");
                    Calculadora calculadora = new Calculadora();
                    calculadora.iniciarCalculadora();
                    break;

                case 3:
                    System.out.println("\nAbriendo Agenda...");
                    Agenda agenda = new Agenda(10); // Capacidad de 10 contactos
                    agenda.menuAgenda();
                    break;
                case 4:
                    System.out.println("\nAbriendo Convertidor...");
                    MenuConvertidor.menuConvertidor(); // Llama al menú del convertidor
                    break;
                case 5:
                    System.out.println("\nAbriendo Piedra, Papel o Tijera...");
                    PiedraPapelTijeras juego = new PiedraPapelTijeras();
                    juego.iniciarJuego();
                    break; // Agregado break para evitar caer en default
                case 6:
                    System.out.println("Apagando celular...");
                    break; // Opción para salir
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break; // Agregado break aquí
            }
        }
        while (opcion != 6); // Cambiado para salir con la opción 6


    }
}
