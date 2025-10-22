import java.util.ArrayList;
public class Detective {
 private String nombre;
    private int aniosExperiencia;
    
    public Detective(String nombre, int aniosExperiencia) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    
    @Override
    public String toString() {
        return "Detective " + nombre + " (" + aniosExperiencia + " años de experiencia)";
    }   
}
