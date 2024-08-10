package src.CincoEjercicios.Ejercicio3;

public class OrdenComida extends Orden{

    @Override
    void calculoDePrecios() {
        System.out.println("Calculando precio de asado huilense...");
        System.out.println("Precio calculado: 15000");
    }

    @Override
    void preparacion() {
        System.out.println("Preparando comida...");
    }

}
