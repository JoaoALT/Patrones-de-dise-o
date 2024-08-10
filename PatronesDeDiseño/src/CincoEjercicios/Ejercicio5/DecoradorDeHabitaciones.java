package src.CincoEjercicios.Ejercicio5;

public class DecoradorDeHabitaciones implements Habitacion{

    private Habitacion envuelto;

    public DecoradorDeHabitaciones(Habitacion envuelto) {
        this.envuelto = envuelto;
    }

    @Override
    public String decorar() {
        return envuelto.decorar();
    }
}
