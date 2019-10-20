package prueba.template;

public abstract class Juego {

    public Jugador jugador1;
    public Jugador jugador2;

    /** METODO TEMPLATE*/
    public void jugar(){
        obtenerPuntos(jugador1);
        obtenerPuntos(jugador2);
        otorgarDiamante(jugador1, jugador2);
    }

    public abstract void obtenerPuntos(Jugador jugador);

    public void otorgarDiamante(Jugador jugador1, Jugador jugador2){
        if (jugador1.getPuntos() >= jugador2.getPuntos()){
            jugador1.setDiamantes(jugador1.getDiamantes() + 1);
            System.out.println("Jugó ".concat(jugador1.getNombre()) + " contra ".concat(jugador2.getNombre()) +
                    ". Ganó ".concat(jugador1.getNombre()) + " y la cantidad de diamantes que tiene ahora es " + jugador1.getDiamantes() );
        }
        else{
            jugador2.setDiamantes(jugador2.getDiamantes() + 1);
            System.out.println("Jugó ".concat(jugador1.getNombre()) + " contra ".concat(jugador2.getNombre()) +
                    ". Ganó ".concat(jugador2.getNombre()) + " y la cantidad de diamantes que tiene ahora es " + jugador2.getDiamantes() );
        }
    }
}
