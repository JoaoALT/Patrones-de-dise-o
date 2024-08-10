package src.CincoEjercicios.Ejercicio1;

public class Mago extends Heroe{

    protected String[] habilidadesBase = {"Habilidades","Clase","De","La","Base","Mago"};

    public Mago(int puntosDeHabilidad, String[] apariencia, String[] habilidadesEspeciales, String nombre, int nivel) {
        super(puntosDeHabilidad, apariencia, habilidadesEspeciales, nombre, nivel);
    }

    @Override
    public Heroe clonar(){
        return new Mago(this.puntosDeHabilidad, this.apariencia, this.habilidadesEspeciales, this.nombre, this.nivel);
    }

    @Override
    public void personalizar(String nombre, String[] apariencia) {
        System.out.println("Personalizando Mago!");
        this.setApariencia(apariencia);
        this.setNombre(nombre);
    }
}
