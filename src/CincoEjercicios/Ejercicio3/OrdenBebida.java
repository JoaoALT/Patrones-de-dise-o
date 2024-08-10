package src.CincoEjercicios.Ejercicio3;

public class OrdenBebida extends Orden{

    @Override
    void calculoDePrecios() {
        System.out.println("Calculando precio de mojito");
        System.out.println("Precio calculado: 12000");
    }

    @Override
    void preparacion() {
        System.out.println("Preparando bebida...");
    }

}
