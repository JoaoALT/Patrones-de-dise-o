package src.CincoEjercicios.Ejercicio2;

import java.util.ArrayList;

public class MensajeriaManager {

    private ArrayList<Dispositivo> dispositivosSuscritos;

    public MensajeriaManager(ArrayList<Dispositivo> dispositivosSuscritos) {
        this.dispositivosSuscritos = dispositivosSuscritos;
    }

    public void suscribirDispositivo(Dispositivo dispositivo){
        dispositivosSuscritos.add(dispositivo);
    }

    public void desuscribirDispositivo(Dispositivo dispositivo){
        dispositivosSuscritos.remove(dispositivo);
    }

    public void notificarSuscriptores(String msg){
        for (Dispositivo dispositivosuscrito: dispositivosSuscritos){
            dispositivosuscrito.notificar(msg);
        }
    }


}
