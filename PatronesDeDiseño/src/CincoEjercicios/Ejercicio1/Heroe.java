package src.CincoEjercicios.Ejercicio1;

public abstract class Heroe {

    protected String nombre;
    protected String[] apariencia;
    protected int nivel;
    protected int puntosDeHabilidad;
    protected String[] habilidadesEspeciales;

    public Heroe(int puntosDeHabilidad, String[] apariencia, String[] habilidadesEspeciales, String nombre, int nivel) {
        this.puntosDeHabilidad = puntosDeHabilidad;
        this.apariencia = apariencia;
        this.habilidadesEspeciales = habilidadesEspeciales;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApariencia(String[] apariencia) {
        this.apariencia = apariencia;
    }

    public abstract Heroe clonar();

    public abstract void personalizar(String nombre, String[] apariencia);
}
