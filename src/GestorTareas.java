import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    // Atributos Lista de tareas

    private ArrayList<Tarea> Listatareas;

    // Constructor de la clase GestorTareas
    public GestorTareas() {
        this.Listatareas = new ArrayList<Tarea>();
    }

    // Método para agregar una tarea
    public void agregarTarea(Tarea tarea) {
        Listatareas.add(tarea);
    }

    // Método para listar todas las tareas
    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("La lista de tareas está vacía.");
            return;
        }
        System.out.println("\n--- LISTA COMPLETA DE TAREAS ---");
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println("Tarea #" + (i + 1));
            listaTareas.get(i).mostrarInfo();
        }
    }
    // Metodo para listar las tareas segun su estado (completadas o pendientes)
    public void listarTareasPorEstado(boolean completada) {
        boolean hayTareas = false;
        for (Tarea tarea : listaTareas) {
            if (tarea.isCompletada() == completada) {
                if (!hayTareas) {
                    System.out.println("\n--- LISTA DE TAREAS " + (completada ? "COMPLETADAS" : "PENDIENTES") + " ---");
                    hayTareas = true;
                }
                tarea.mostrarInfo();
            }
        }
        if (!hayTareas) {
            System.out.println("No hay tareas " + (completada ? "completadas" : "pendientes") + ".");
        }
    }
    // Metodo para marcar una tarea como completada
    public void completarTarea(int indice) {
        if (indice < 0 || indice >= listaTareas.size()) {
            System.out.println("Índice de tarea inválido.");
            return;
        }
        Tarea tarea = listaTareas.get(indice);
        tarea.completar();
        System.out.println("Tarea #" + (indice + 1) + " marcada como completada.");
    }
    // Metodo para editar una tarea
    public void editarTarea(int indice, String descripcion, String fechalimite, String prioridad, String categoria) {
        if (indice < 0 || indice >= listaTareas.size()) {
            System.out.println("Índice de tarea inválido.");
            return;
        }
        Tarea tarea = listaTareas.get(indice);
        tarea.editar(descripcion, fechalimite, prioridad, categoria);
        System.out.println("Tarea #" + (indice + 1) + " editada correctamente.");
    }
    // Método para eliminar una tarea
    public void eliminarTarea(int indice) {
        if (indice < 0 || indice >= listaTareas.size()) {
            System.out.println("Índice de tarea inválido.");
            return;
        }
        listaTareas.remove(indice);
        System.out.println("Tarea #" + (indice + 1) + " eliminada correctamente.");
    }
    
}
