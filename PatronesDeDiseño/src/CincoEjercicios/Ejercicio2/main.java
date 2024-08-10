package src.CincoEjercicios.Ejercicio2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Dispositivo> dispositivosFamilia = new ArrayList<Dispositivo>();

        Dispositivo LaptopDeIvan = new LaptopHp();
        Dispositivo IpadDeMaria = new Ipad();
        Dispositivo XiaomiDeMama = new Xiaomi();

        dispositivosFamilia.add(IpadDeMaria);
        dispositivosFamilia.add(LaptopDeIvan);

        MensajeriaManager MensajeriaInstantanea = new MensajeriaManager(dispositivosFamilia);

        MensajeriaInstantanea.suscribirDispositivo(XiaomiDeMama);

        MensajeriaInstantanea.notificarSuscriptores("Se ha suscrito XiaomiDeMama");

        MensajeriaInstantanea.desuscribirDispositivo(IpadDeMaria);

        MensajeriaInstantanea.notificarSuscriptores("Se ha desuscrito IpadDeMaria");

    }
}
