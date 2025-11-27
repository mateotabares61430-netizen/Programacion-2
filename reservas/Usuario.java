package reservas;

public class Usuario {

    private String nombre;
    private String id;
    private String email;
    private String telefono;
    
    public Usuario(String nombre, String id, String email, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefono() {
        return telefono;
    } 

    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);
    }
    
    @Override
    public String toString() {
        return "Usuario: " + nombre + " (ID: " + id + ")" + "Telefono: " + telefono;
    }

       
    
}
