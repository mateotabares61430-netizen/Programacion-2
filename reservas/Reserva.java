package reservas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Reserva {

    private static int contadorReservas = 1;
    private int numeroReserva;
    private Usuario usuario;
    private Recurso recurso;
    private LocalDateTime fechaHora;
    private int duracionHoras;
    private String estado;
    
    public Reserva(Usuario usuario, Recurso recurso, LocalDateTime fechaHora, int duracionHoras) {
        this.numeroReserva = contadorReservas++;
        this.usuario = usuario;
        this.recurso = recurso;
        this.fechaHora = fechaHora;
        this.duracionHoras = duracionHoras;
        this.estado = "Activa";
        recurso.setDisponible(false);
    }
    
    public int getNumeroReserva() {
        return numeroReserva;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public Recurso getRecurso() {
        return recurso;
    }
    
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    
    public int getDuracionHoras() {
        return duracionHoras;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void cancelarReserva() {
        this.estado = "Cancelada";
        recurso.setDisponible(true);
        System.out.println("Reserva #" + numeroReserva + " cancelada exitosamente");
    }
    
    public void mostrarInformacion() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("\n RESERVA #" + numeroReserva + " ");
        System.out.println("Estado: " + estado);
        System.out.println("Fecha y Hora: " + fechaHora.format(formatter));
        System.out.println("Duración: " + duracionHoras + " hora(s)");
        System.out.println("\n--- Usuario ---");
        usuario.mostrarInformacion();
        System.out.println("\n--- Recurso ---");
        recurso.mostrarInformacion();
        System.out.println("=====================================\n");
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Reserva #" + numeroReserva + ": " + usuario.getNombre() + 
               " - " + recurso.getNombre() + " (" + fechaHora.format(formatter) + ")";
    } 

}
