package prueba.template;

public class LejanosA6 extends Juego {

    public LejanosA6(String nom1, String nom2){
       this.jugador1 = new Jugador(nom1);
       this.jugador2 = new Jugador(nom2);
    }

    @Override
    public void obtenerPuntos(Jugador jugador) {
        jugador.setPuntos(0);
        int puntos = 0;
        for (int i = 0; i <= 9; i++) {
            int valor = (int)(Math.random()*10) + 1;
            if (valor <= 6){
                valor = Math.abs(valor - 6);
            }
            else{
                valor = valor - 6;
            }
            puntos += valor;
        }
        jugador.setPuntos(jugador.getPuntos() + puntos);
    }
}
