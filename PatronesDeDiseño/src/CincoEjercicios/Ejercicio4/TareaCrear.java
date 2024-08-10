package src.CincoEjercicios.Ejercicio4;

public class TareaCrear extends Tarea{

    TareaCrear(EditorDeTareas editorDeTareas) {
        super(editorDeTareas);
    }

    @Override
    public void ejecutar() {
        editorDeTareas.crearTarea(this);
    }
}
