package src.CincoEjercicios.Ejercicio2;

public class Xiaomi implements Dispositivo {

    @Override
    public void notificar(String msg) {
        System.out.println("Xiaomi notificacion recibida: "+msg);
    }
}
