package src.CincoEjercicios.Ejercicio4;

public class TareaEliminar extends Tarea{

    TareaEliminar(EditorDeTareas editorDeTareas) {
        super(editorDeTareas);
    }

    @Override
    public void ejecutar() {
        editorDeTareas.eliminarTarea(this);
    }
}
