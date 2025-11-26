package reservas;

public class Profesor extends Usuario {

private String departamento;
    private String especialidad;
    
    public Profesor(String nombre, String id, String email, String departamento, String especialidad) {
        super(nombre, id, email);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void programarClase() {
        System.out.println("El profesor " + getNombre() + " está programando una clase de " + especialidad);
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidad: " + especialidad);
    }
    
    @Override
    public String toString() {
        return "Profesor: " + getNombre() + " - Dpto. " + departamento;
    }
    
}
