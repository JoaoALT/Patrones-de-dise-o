package src.CincoEjercicios.Ejercicio1;

public class Arquero extends Heroe{

    private String[] habilidadesBase = {"Arquero","Clase","La","De","Base","Habilidades"};

    public Arquero(int puntosDeHabilidad, String[] apariencia, String[] habilidadesEspeciales, String nombre, int nivel) {
        super(puntosDeHabilidad, apariencia, habilidadesEspeciales, nombre, nivel);
    }

    @Override
    public Heroe clonar(){
        return new Arquero(this.puntosDeHabilidad, this.apariencia, this.habilidadesEspeciales, this.nombre, this.nivel);
    }

    @Override
    public void personalizar(String nombre, String[] apariencia){
        System.out.println("Personalizando arquero!");
        this.setApariencia(apariencia);
        this.setNombre(nombre);
    }
}
