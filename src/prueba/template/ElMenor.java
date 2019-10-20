package prueba.template;

public class ElMenor extends Juego {

    public ElMenor(String nom1, String nom2) {
        this.jugador1 = new Jugador(nom1);
        this.jugador2 = new Jugador(nom2);
    }

    @Override
    public void obtenerPuntos(Jugador jugador) {
        jugador.setPuntos(0);
        int valor = 10;
        for (int i = 0; i <= 9; i++) {
            int valor2 = (int)(Math.random()*10 + 1);
            if (valor2 < valor){
                valor = valor2;
            }
        }
        jugador.setPuntos(valor);
    }
}
