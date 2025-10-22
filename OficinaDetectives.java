import java.util.ArrayList;
public class OficinaDetectives {
 private String nombreOficina;
    private ArrayList<Caso> casos;
    private ArrayList<Sospechoso> registroSospechosos; // Base de datos de sospechosos
    private ArrayList<Detective> detectives;
    
    public OficinaDetectives(String nombreOficina) {
        this.nombreOficina = nombreOficina;
        this.casos = new ArrayList<>();
        this.registroSospechosos = new ArrayList<>();
        this.detectives = new ArrayList<>();
    }
    
    // Agregar detective a la oficina
    public void contratarDetective(Detective detective) {
        detectives.add(detective);
    }
    
    // Crear un nuevo caso
    public boolean crearCaso(int numeroCaso, String nombreClave, 
                             Detective detective, String descripcion) {
        // Verificar que el número de caso no exista
        if (buscarCaso(numeroCaso) != null) {
            System.out.println("Ya existe un caso con ese número.");
            return false;
        }
        
        Caso nuevoCaso = new Caso(numeroCaso, nombreClave, detective, descripcion);
        casos.add(nuevoCaso);
        return true;
    }
    
    // Buscar caso por número
    public Caso buscarCaso(int numeroCaso) {
        for (Caso caso : casos) {
            if (caso.getNumeroCaso() == numeroCaso) {
                return caso;
            }
        }
        return null;
    }
    
    // Buscar o registrar sospechoso (evita duplicados en la base de datos general)
    public Sospechoso buscarORegistrarSospechoso(String nombre, String alias, int edad, 
                                                  String direccion, String foto, 
                                                  String descripcion) {
        // Primero buscar si ya existe
        Sospechoso existente = buscarSospechoso(nombre);
        
        if (existente != null) {
            System.out.println("Sospechoso ya registrado en la base de datos.");
            return existente;
        }
        
        // Si no existe, crear uno nuevo
        Sospechoso nuevoSospechoso = new Sospechoso(nombre, alias, edad, 
                                                     direccion, foto, descripcion);
        registroSospechosos.add(nuevoSospechoso);
        System.out.println("Nuevo sospechoso registrado en la base de datos.");
        return nuevoSospechoso;
    }
    
    // Buscar sospechoso en la base de datos general
    public Sospechoso buscarSospechoso(String nombre) {
        for (Sospechoso s : registroSospechosos) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                return s;
            }
        }
        return null;
    }
    
    // Agregar sospechoso a un caso específico
    public boolean agregarSospechosoACaso(int numeroCaso, Sospechoso sospechoso) {
        Caso caso = buscarCaso(numeroCaso);
        if (caso == null) {
            System.out.println("Caso no encontrado.");
            return false;
        }
        return caso.agregarSospechoso(sospechoso);
    }
    
    // Consultar todos los casos de un detective
    public ArrayList<Caso> consultarCasosPorDetective(String nombreDetective) {
        ArrayList<Caso> casosDelDetective = new ArrayList<>();
        for (Caso caso : casos) {
            if (caso.getDetectiveResponsable().getNombre().equalsIgnoreCase(nombreDetective)) {
                casosDelDetective.add(caso);
            }
        }
        return casosDelDetective;
    }
    
    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("\n=== " + nombreOficina + " ===");
        System.out.println("Total de casos: " + casos.size());
        System.out.println("Sospechosos registrados: " + registroSospechosos.size());
        System.out.println("Detectives: " + detectives.size());
    }
}

