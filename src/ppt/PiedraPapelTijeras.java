package ppt;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    private int puntosJugador;
    private int puntosComputadora;
    private Scanner scanner;

    public PiedraPapelTijeras() {
        this.puntosJugador = 0;
        this.puntosComputadora = 0;
        this.scanner = new Scanner(System.in);
    }

    public boolean iniciarJuego() {
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijeras!");

        while (puntosJugador < 2 && puntosComputadora < 2) {
            if (!jugarRonda()) { // Si el jugador elige salir, retorna false
                return false;
            }
        }

        if (puntosJugador == 2) {
            System.out.println("¡Felicidades! Has ganado el juego.");
        } else {
            System.out.println("La computadora ha ganado el juego. ¡Mejor suerte la próxima vez!");
        }

        return true; // El juego terminó sin que el jugador saliera
    }

    private boolean jugarRonda() {
        System.out.println("+=============================+");
        System.out.println("|  PIEDRA, PAPEL O TIJERAS    |");
        System.out.println("+=============================+");
        System.out.println("| Selecciona una opción:      |");
        System.out.println("|                             |");
        System.out.println("| 1. Piedra                   |");
        System.out.println("|                             |");
        System.out.println("| 2. Papel                    |");
        System.out.println("|                             |");
        System.out.println("| 3. Tijeras                  |");
        System.out.println("|                             |");
        System.out.println("| 4. Salir                    |");
        System.out.println("+=============================+");

        int eleccionJugador = scanner.nextInt();
        if (eleccionJugador == 4) {
            System.out.println("Saliendo del juego...");
            return false; // Retorna false para indicar que se desea salir
        }

        String opcionJugador = obtenerOpcionJugador(eleccionJugador);
        String opcionComputadora = obtenerOpcionComputadora();

        System.out.println("La computadora ha elegido: " + opcionComputadora);
        determinarGanador(opcionJugador, opcionComputadora);
        mostrarPuntuaciones();

        return true; // Continúa el juego
    }

    private String obtenerOpcionJugador(int eleccion) {
        return switch (eleccion) {
            case 1 -> "Piedra";
            case 2 -> "Papel";
            case 3 -> "Tijeras";
            default -> "";
        };
    }

    private String obtenerOpcionComputadora() {
        Random rand = new Random();
        int eleccionComputadora = rand.nextInt(3) + 1; // Devuelve 1, 2 o 3
        return obtenerOpcionJugador(eleccionComputadora);
    }

    private void determinarGanador(String jugador, String computadora) {
        if (jugador.equals(computadora)) {
            System.out.println("¡Es un empate!");
        } else if (ganaJugador(jugador, computadora)) {
            System.out.println("¡Ganaste esta ronda!");
            puntosJugador++;
        } else {
            System.out.println("La computadora gana esta ronda.");
            puntosComputadora++;
        }
    }

    private boolean ganaJugador(String jugador, String computadora) {
        return (jugador.equals("Piedra") && computadora.equals("Tijeras")) ||
                (jugador.equals("Papel") && computadora.equals("Piedra")) ||
                (jugador.equals("Tijeras") && computadora.equals("Papel"));
    }

    private void mostrarPuntuaciones() {
        System.out.println("Puntuaciones - Jugador: " + puntosJugador + ", Computadora: " + puntosComputadora);
    }

   
}
