package src.CincoEjercicios.Ejercicio5;

public class DecoradorDeVino extends DecoradorDeHabitaciones{

    public DecoradorDeVino(Habitacion envuelto) {
        super(envuelto);
    }

    @Override
    public String decorar(){
        return  super.decorar() + " ;Vino Pinot Noir";
    }
}
