package src.CincoEjercicios.Ejercicio1;

public class Guerrero extends Heroe{

    protected String[] habilidadesBase = {"Habilidades","Base","De","La","Clase","Guerrero"};

    public Guerrero(int puntosDeHabilidad, String[] apariencia, String[] habilidadesEspeciales, String nombre, int nivel) {
        super(puntosDeHabilidad, apariencia, habilidadesEspeciales, nombre, nivel);
    }

    @Override
    public Heroe clonar(){
        return new Guerrero(this.puntosDeHabilidad, this.apariencia, this.habilidadesEspeciales, this.nombre, this.nivel);
    }

    @Override
    public void personalizar(String nombre, String[] apariencia){
        System.out.println("Personalizando guerrero!");
        this.setApariencia(apariencia);
        this.setNombre(nombre);
    }
}
