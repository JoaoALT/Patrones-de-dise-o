package src.CincoEjercicios.Ejercicio4;

public abstract class Tarea {
    public EditorDeTareas editorDeTareas;

    Tarea(EditorDeTareas editorDeTareas) {
        this.editorDeTareas = editorDeTareas;
    }
    public abstract void ejecutar();
}
