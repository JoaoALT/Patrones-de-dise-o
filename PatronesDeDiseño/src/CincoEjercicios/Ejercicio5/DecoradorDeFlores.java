package src.CincoEjercicios.Ejercicio5;

public class DecoradorDeFlores extends DecoradorDeHabitaciones{

    public DecoradorDeFlores(Habitacion envuelto) {
        super(envuelto);
    }

    @Override
    public String decorar(){
        return  super.decorar() + " ;Flores frescas";
    }
}
