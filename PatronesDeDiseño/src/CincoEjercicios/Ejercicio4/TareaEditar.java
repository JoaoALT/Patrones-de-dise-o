package src.CincoEjercicios.Ejercicio4;

public class TareaEditar extends Tarea{

    TareaEditar(EditorDeTareas editorDeTareas) {
        super(editorDeTareas);
    }

    @Override
    public void ejecutar() {
        editorDeTareas.editarTarea(this);
    }
}
