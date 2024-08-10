package src.CincoEjercicios.Ejercicio1;

public class main {
    public static void main(String[] args) {

        Guerrero guerrero1 = new Guerrero(10, new String[]{"Alto", "Piel Morena", "Ojos cafes", "Bata de guerrero","Sandalias griegas"},new String[]{"Pisado fuerte","Voluntad de defenza", "Imbuyo Magico"},"Samuel",3);

        Guerrero guerreroclon = (Guerrero) guerrero1.clonar();

        guerreroclon.personalizar("Gabriel",new String[]{"Alto", "Piel Morena", "Ojos cafes","Sandalias griegas","Flaco"});

        System.out.println("Informacion del primer guerrero creado:");

        ImprimirHeroeInfo(guerrero1);

        System.out.println("Informacion del segundo guerrero creado:");

        ImprimirHeroeInfo(guerreroclon);

    }

    public static void ImprimirHeroeInfo(Heroe heroe){

        System.out.println(heroe.nivel);
        System.out.println(heroe.puntosDeHabilidad);
        System.out.println(heroe.nombre);
        System.out.println(heroe.habilidadesEspeciales);
        System.out.println(heroe.apariencia);

    }
}
