
package reservas;

public class Recurso {

private String nombre;
    private String codigo;
    private String ubicacion;
    private boolean disponible;
    
    public Recurso(String nombre, String codigo, String ubicacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.disponible = true;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void mostrarInformacion() {
        System.out.println("Recurso: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Reservado"));
    }
    
    @Override
    public String toString() {
        return "Recurso: " + nombre + " (Código: " + codigo + ")";
    }

}
