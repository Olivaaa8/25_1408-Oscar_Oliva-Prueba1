public class Tarea {
    // Atributos de la clase Tarea
    private String descripcion;
    private String fechalimite;
    private String prioridad; // alta, media, baja
    private String categoria; // personal, trabajo, estudio, otro
    private boolean completada;

    // Constructor de la clase Tarea
    public Tarea(String descripcion, String fechalimite, String prioridad, String categoria) {
        this.descripcion = descripcion;
        this.fechalimite = fechalimite;
        this.prioridad = prioridad;
        this.categoria = categoria;
        this.completada = false; // Por defecto, la tarea no está completada
    }

    // Getters y Setters

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechalimite() {
        return fechalimite;
    }
    public void setFechalimite(String fechalimite) {
        this.fechalimite = fechalimite;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public boolean isCompletada() {
        return completada;
    }
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
