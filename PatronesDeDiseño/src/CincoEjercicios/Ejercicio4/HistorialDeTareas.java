package src.CincoEjercicios.Ejercicio4;

import java.util.Stack;

public class HistorialDeTareas {
    private Stack<Tarea> historial = new Stack<>();

    public void push(Tarea tarea) {
        historial.push(tarea);
    }

    public Tarea pop() {
        return historial.pop();
    }

    public boolean isEmpty() {
        return historial.isEmpty();
    }

    public void printHistory() {
        System.out.println("\nhistorial de tareas:");
        for (Tarea tarea : historial) {
            System.out.println(tarea);
        }
    }
}
