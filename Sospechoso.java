import java.util.ArrayList;
public class Sospechoso {
 private String nombre;
    private String alias;
    private int edad;
    private String ultimaDireccion;
    private String foto;
    private String descripcionFisica;
    
    public Sospechoso(String nombre, String alias, int edad, String ultimaDireccion, 
                      String foto, String descripcionFisica) {
        this.nombre = nombre;
        this.alias = alias;
        this.edad = edad;
        this.ultimaDireccion = ultimaDireccion;
        this.foto = foto;
        this.descripcionFisica = descripcionFisica;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getAlias() {
        return alias;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getUltimaDireccion() {
        return ultimaDireccion;
    }
    
    public String getFoto() {
        return foto;
    }
    
    public String getDescripcionFisica() {
        return descripcionFisica;
    }
    
    // Setters (por si necesitan actualizar información)
    public void setUltimaDireccion(String nuevaDireccion) {
        this.ultimaDireccion = nuevaDireccion;
    }
    
    public void setFoto(String nuevaFoto) {
        this.foto = nuevaFoto;
    }
    
    @Override
    public String toString() {
        return "Sospechoso: " + nombre + 
               (alias != null ? " (alias: " + alias + ")" : "") + 
               ", Edad: " + edad;
    }
}   

