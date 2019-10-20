package prueba.template;

import java.util.ArrayList;

public abstract class SalaDeJuegos {

    static ArrayList<Juego> listaJuegos = new ArrayList<Juego>();

    static void agregarJuego(Juego juego){
        listaJuegos.add(juego);

    }

    static Jugador jugadorConMasDiamantes(){
        Jugador ganador = listaJuegos.get(0).jugador1;
        for (Juego juego : listaJuegos){
            if (juego.jugador1.getDiamantes() > ganador.getDiamantes()){
                ganador = juego.jugador1;
            }
            if (juego.jugador2.getDiamantes() > ganador.getDiamantes()){
                ganador = juego.jugador2;
            }
        }
        System.out.println("El jugador con mas diamantes de la sala es: " .concat(ganador.getNombre()));
        return ganador;
    }

    static Jugador jugadorConMenosPuntos(){
        Jugador jugador = listaJuegos.get(0).jugador1;
        for (Juego juego : listaJuegos){
            if (juego.jugador1.getPuntos() < jugador.getPuntos()){
                jugador = juego.jugador1;
            }
            if (juego.jugador2.getPuntos() < jugador.getPuntos()){
                jugador = juego.jugador2;
            }
        }

        System.out.println("El jugador con menos puntos de la sala es: ".concat(jugador.getNombre()));
        return jugador;
    }
}
