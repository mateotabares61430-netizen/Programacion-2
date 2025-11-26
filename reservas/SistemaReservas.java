package reservas;

import java.util.ArrayList;

public class SistemaReservas {

private ArrayList<Reserva> reservas;
    private String nombreUniversidad;
    
    public SistemaReservas(String nombreUniversidad) {
        this.reservas = new ArrayList<>();
        this.nombreUniversidad = nombreUniversidad;
    }
    
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva #" + reserva.getNumeroReserva() + " agregada exitosamente");
    }
    
    public void mostrarTodasLasReservas() {
        System.out.println("\n SISTEMA DE RESERVAS - " + nombreUniversidad.toUpperCase() + " ");
        System.out.println("\nTotal de reservas: " + reservas.size());
        
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva reserva : reservas) {
                reserva.mostrarInformacion();
            }
        }
    }
    
    public void mostrarReservasActivas() {
        System.out.println("\n--- RESERVAS ACTIVAS ---");
        int contador = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getEstado().equals("Activa")) {
                System.out.println(reserva.toString());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay reservas activas.");
        }
    }
    
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

}
