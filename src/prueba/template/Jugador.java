package prueba.template;

public class Jugador {
    private String nombre;
    private int diamantes = 0;
    private int puntos;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDiamantes() {
        return diamantes;
    }
    public void setDiamantes(int diamantes) {
        this.diamantes = diamantes;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
