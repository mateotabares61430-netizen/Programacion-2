package reservas;

public class Sala extends Recurso {
    
    private int capacidad;
    private boolean tieneProyector;
    
    public Sala(String nombre, String codigo, String ubicacion, int capacidad, boolean tieneProyector) {
        super(nombre, codigo, ubicacion);
        this.capacidad = capacidad;
        this.tieneProyector = tieneProyector;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public boolean isTieneProyector() {
        return tieneProyector;
    }
    
    public void verificarEquipamiento() {
        System.out.println("Verificando equipamiento de la sala " + getNombre());
        System.out.println("Proyector: " + (tieneProyector ? "Disponible" : "No disponible"));
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad: " + capacidad + " personas");
        System.out.println("Proyector: " + (tieneProyector ? "Sí" : "No"));
    }
    
    @Override
    public String toString() {
        return "Sala: " + getNombre() + " - Capacidad: " + capacidad;
    }

}
