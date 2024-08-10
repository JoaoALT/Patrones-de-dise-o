package src.CincoEjercicios.Ejercicio4;

public class TareaCompleta extends Tarea{

    TareaCompleta(EditorDeTareas editorDeTareas) {
        super(editorDeTareas);
    }

    @Override
    public void ejecutar() {
        editorDeTareas.completarTarea(this);
    }
}
