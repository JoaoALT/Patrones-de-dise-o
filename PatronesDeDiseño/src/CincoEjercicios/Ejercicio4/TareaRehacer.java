package src.CincoEjercicios.Ejercicio4;

public class TareaRehacer extends Tarea{

    TareaRehacer(EditorDeTareas editorDeTareas) {
        super(editorDeTareas);
    }

    @Override
    public void ejecutar() {
        editorDeTareas.rehacer();
    }
}
