package src.CincoEjercicios.Ejercicio3;

public class OrdenPostre extends Orden{

    @Override
    void calculoDePrecios() {
        System.out.println("Calculando precio de Crème Brûlée...");
        System.out.println("Precio calculado: 10000");
    }

    @Override
    void preparacion() {
        System.out.println("Preparando postre...");
    }

}
