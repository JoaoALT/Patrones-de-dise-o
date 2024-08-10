package src.CincoEjercicios.Ejercicio5;

public class DecoradorDeTelevision extends DecoradorDeHabitaciones{

    public DecoradorDeTelevision(Habitacion envuelto) {
        super(envuelto);
    }

    @Override
    public String decorar(){
        return  super.decorar() + " ;Television plana";
    }
}
