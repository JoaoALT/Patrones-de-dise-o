package src.CincoEjercicios.Ejercicio4;

public class EditorDeTareas {
    protected HistorialDeTareas historialdeTareas;

    public void crearTarea(Tarea tarea){
        System.out.println("Tarea creada");
        ejecutar(tarea);
    }

    public void editarTarea(Tarea tarea){
        System.out.println("Tarea editada");
        ejecutar(tarea);
    }

    public void eliminarTarea(Tarea tarea){
        System.out.println("Tarea eliminada");
        ejecutar(tarea);
    }

    public void completarTarea(Tarea tarea){
        System.out.println("Tarea completada");
        ejecutar(tarea);
    }

    public void rehacer() {
        if(historialdeTareas.isEmpty()) {
            System.out.println("No se puede realizar la accion");
            return;
        }
        Tarea tarea = historialdeTareas.pop();
        System.out.println("Se deshizo el comando: " + tarea);
    }

    private void ejecutar(Tarea tarea) {
        historialdeTareas.push(tarea);
    }
}
