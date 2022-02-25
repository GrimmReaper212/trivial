package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean noGanador;

    public static void main(String[] args) {
        Game juego = new Game();

        try {
            juego.agregar("Maria");
            juego.agregar("Juan");
            juego.agregar("Antonio");
            juego.agregar("Mario");
            juego.agregar("Juana");
            juego.agregar("Antonia");

            if (juego.esJugable() && juego.menosDe6Jugadores()) {
                Random rand = new Random();

                do {
                    juego.tirarDado(rand.nextInt(5) + 1);

                    if (rand.nextInt(9) == 7) {
                        noGanador = juego.respuestaIncorrecta();
                    } else {
                        noGanador = juego.fueRespuestaCorrecta();
                    }
                } while (noGanador);
            } else {
                System.out.println("Necesitas al menos 2 jugadores para comenzar la partida...");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lo sentimos, no puede iniciar la partida si sois más de 6 jugadores");
        }

    }
}
