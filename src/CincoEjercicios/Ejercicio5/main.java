package src.CincoEjercicios.Ejercicio5;

public class main {

    public static void main(String[] args) {

        DecoradorDeHabitaciones SuperDeco = new DecoradorDeTelevision(new DecoradorDeChocolate(new DecoradorDeVino(new DecoradorDeFlores(new HabitacionSencilla()))));

        System.out.println(SuperDeco.decorar());

    }
}
