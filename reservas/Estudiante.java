package reservas;

public class Estudiante extends Usuario {

private String carrera;
    private int semestre;
    
    public Estudiante(String nombre, String id, String email, String carrera, int semestre) {
        super(nombre, id, email);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    public void solicitarTutoria() {
        System.out.println(getNombre() + " ha solicitado una tutoría académica");
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
    
    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + " - " + carrera + " (Semestre " + semestre + ")";
    }

}
