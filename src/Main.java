import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner o = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- GESTOR DE TAREAS PERSONALES ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Editar tarea");
            System.out.println("5. Listar tareas pendientes");
            System.out.println("6. Listar tareas completadas");
            System.out.println("7. Eliminar tarea");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = o.nextInt();
            o.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = o.nextLine();
                    System.out.print("Fecha límite (DD/MM/AAAA): ");
                    String fechalimite = o.nextLine();
                    System.out.print("Prioridad (Alta, Media, Baja): ");
                    String prioridad = o.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = o.nextLine();

                    Tarea nuevaTarea = new Tarea(descripcion, fechalimite, prioridad, categoria);
                    gestor.agregarTarea(nuevaTarea);
                    System.out.println("Tarea agregada exitosamente.");
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.print("Ingrese el índice de la tarea a completar: ");
                    int indiceCompletar = o.nextInt() - 1;
                    gestor.completarTarea(indiceCompletar);
                    break;
                case 4:
                    System.out.print("Ingrese el índice de la tarea a editar: ");
                    int indiceEditar = o.nextInt() - 1;
                    o.nextLine(); // Limpiar el buffer
                    System.out.print("Nueva descripción: ");
                    String nuevaDescripcion = o.nextLine();
                    System.out.print("Nueva fecha límite (DD/MM/AAAA): ");
                    String nuevaFechaLimite = o.nextLine();
                    System.out.print("Nueva prioridad (Alta, Media, Baja): ");
                    String nuevaPrioridad = o.nextLine();
                    System.out.print("Nueva categoría: ");
                    String nuevaCategoria = o.nextLine();

                    gestor.editarTarea(indiceEditar, nuevaDescripcion, nuevaFechaLimite, nuevaPrioridad, nuevaCategoria);
                    break;
                case 5:
                    gestor.listarTareasPorEstado(false);
                    break;
                case 6:
                    gestor.listarTareasPorEstado(true);
                    break;
                case 7:
                    System.out.print("Ingrese el índice de la tarea a eliminar: ");
                    int indiceEliminar = o.nextInt() - 1;
                    gestor.eliminarTarea(indiceEliminar);
                    break;
                case 8:
                    salir = true;
                    System.out.println("Saliendo del gestor de tareas.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}