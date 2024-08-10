package src.CincoEjercicios.Ejercicio2;

public class LaptopHp implements Dispositivo {

    @Override
    public void notificar(String msg) {
        System.out.println("Laptop notificacion recibida: "+msg);
    }
}
