package src.CincoEjercicios.Ejercicio5;

public class DecoradorDeChocolate extends DecoradorDeHabitaciones{

    public DecoradorDeChocolate(Habitacion envuelto) {
        super(envuelto);
    }

    @Override
    public String decorar(){
        return  super.decorar() + " ;Chocolate 100% cacao";
    }
}
