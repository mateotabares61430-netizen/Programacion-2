package reservas;

public class Cancha extends Recurso {
    
    private String tipoDeporte;
    private boolean techada;
    
    public Cancha(String nombre, String codigo, String ubicacion, String tipoDeporte, boolean techada) {
        super(nombre, codigo, ubicacion);
        this.tipoDeporte = tipoDeporte;
        this.techada = techada;
    }
    
    public String getTipoDeporte() {
        return tipoDeporte;
    }
    
    public boolean isTechada() {
        return techada;
    }
    
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de la cancha de " + tipoDeporte);
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Deporte: " + tipoDeporte);
        System.out.println("Tipo: " + (techada ? "Techada" : "Al aire libre"));
    }
    
    @Override
    public String toString() {
        return "Cancha de " + tipoDeporte + " - " + getNombre();
    }

}
