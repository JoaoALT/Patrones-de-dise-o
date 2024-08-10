package src.CincoEjercicios.Ejercicio3;

public abstract class Orden {

    public void templateMethodOrden(){
        tomarPedido();

        if (verificacionDisponibilidad()){
            preparacion();
            calculoDePrecios();
            entregaOrden();
        }
        else {
            System.out.println("No hay disponibilidad...");
        }
    }

    public void tomarPedido(){
        System.out.println("Tomando su pedido...");
    }

    public boolean verificacionDisponibilidad(){
        System.out.println("Verificando disponibilidad...");
        return true;
    }

    public void entregaOrden(){
        System.out.println("Orden entregada...");
    }

    abstract void calculoDePrecios();

    abstract void preparacion();


}
