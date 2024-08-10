package src.CincoEjercicios.Ejercicio2;

public class Ipad implements Dispositivo {

    @Override
    public void notificar(String msg) {
        System.out.println("Ipad notificacion recibida: "+msg);
    }
}
