package src.CincoEjercicios.Ejercicio4;

public class main {
    public static void main(String[] args) {
        EditorDeTareas editorDeTareas = new EditorDeTareas();
        Tarea crear = new TareaCrear(editorDeTareas);
        Tarea editar = new TareaEditar(editorDeTareas);
        Tarea eliminar = new TareaEliminar(editorDeTareas);
        Tarea rehacer = new TareaRehacer(editorDeTareas);
        Tarea completar = new TareaCompleta(editorDeTareas);

        crear.ejecutar();
        editar.ejecutar();
        eliminar.ejecutar();
        completar.ejecutar();

        editorDeTareas.historialdeTareas.printHistory();

        System.out.println("////////////////////////////////////////////////");
        rehacer.ejecutar();
        editorDeTareas.historialdeTareas.printHistory();
    }
}
