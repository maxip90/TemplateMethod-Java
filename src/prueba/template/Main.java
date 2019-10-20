package prueba.template;

public class Main {

    public static void main(String[] args) {
        Juego lejanosA6 = new LejanosA6("maxi", "jose");
        SalaDeJuegos.agregarJuego(lejanosA6);
        lejanosA6.jugar();
        lejanosA6.jugar();
        Juego lejanosA62 = new LejanosA6("gabi", "maria");
        SalaDeJuegos.agregarJuego(lejanosA62);
        System.out.println("/////////////////////////");
        lejanosA62.jugar();
        lejanosA62.jugar();
        lejanosA62.jugar();
        Juego elmenor = new ElMenor("pepe", "carlos");
        SalaDeJuegos.agregarJuego(elmenor);
        System.out.println("/////////////////////////");
        elmenor.jugar();
        elmenor.jugar();
        elmenor.jugar();
        Juego losimpares = new LosImpares("Adrian", "Marcelo");
        SalaDeJuegos.agregarJuego(losimpares);
        System.out.println("/////////////////////////");
        losimpares.jugar();
        losimpares.jugar();
        losimpares.jugar();
        System.out.println("/////////////////////////");
        SalaDeJuegos.jugadorConMasDiamantes();
        SalaDeJuegos.jugadorConMenosPuntos();
    }
}
