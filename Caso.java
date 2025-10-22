import java.util.ArrayList;
public class Caso {
 private int numeroCaso;
    private String nombreClave;
    private Detective detectiveResponsable;
    private String descripcionDelito;
    private ArrayList<Sospechoso> sospechosos;
    
    public Caso(int numeroCaso, String nombreClave, Detective detectiveResponsable, 
                String descripcionDelito) {
        this.numeroCaso = numeroCaso;
        this.nombreClave = nombreClave;
        this.detectiveResponsable = detectiveResponsable;
        this.descripcionDelito = descripcionDelito;
        this.sospechosos = new ArrayList<>();
    }
    
    // Agregar sospechoso al caso
    public boolean agregarSospechoso(Sospechoso sospechoso) {
        // Verificar que no esté ya en la lista de sospechosos de este caso
        for (Sospechoso s : sospechosos) {
            if (s.getNombre().equalsIgnoreCase(sospechoso.getNombre())) {
                System.out.println("Este sospechoso ya está en el caso.");
                return false;
            }
        }
        sospechosos.add(sospechoso);
        return true;
    }
    
    // Buscar sospechoso por nombre en este caso
    public Sospechoso buscarSospechoso(String nombre) {
        for (Sospechoso s : sospechosos) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                return s;
            }
        }
        return null;
    }
    
    // Getters
    public int getNumeroCaso() {
        return numeroCaso;
    }
    
    public String getNombreClave() {
        return nombreClave;
    }
    
    public Detective getDetectiveResponsable() {
        return detectiveResponsable;
    }
    
    public String getDescripcionDelito() {
        return descripcionDelito;
    }
    
    public ArrayList<Sospechoso> getSospechosos() {
        return sospechosos;
    }
    
    public int getCantidadSospechosos() {
        return sospechosos.size();
    }
    
    @Override
    public String toString() {
        return "Caso #" + numeroCaso + " '" + nombreClave + "' - " + 
               detectiveResponsable.getNombre() + 
               " (" + sospechosos.size() + " sospechosos)";
    }   
}
