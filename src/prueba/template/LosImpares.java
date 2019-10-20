package prueba.template;

public class LosImpares extends Juego {

    public LosImpares(String nom1, String nom2) {
        this.jugador1 = new Jugador(nom1);
        this.jugador2 = new Jugador(nom2);
    }

    @Override
    public void obtenerPuntos(Jugador jugador) {
        int puntos = 0;
        jugador.setPuntos(0);
        for (int i = 0; i <=9 ; i++) {
            int valor = (int)(Math.random() * 10) + 1;
            if (valor %2!=0){
                puntos += valor;
            }
        }
        jugador.setPuntos(puntos);
    }
}
