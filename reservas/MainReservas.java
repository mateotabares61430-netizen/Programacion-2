package reservas;
import java.time.LocalDateTime;

public class MainReservas {

public static void main(String[] args) {
        // Crear el sistema de reservas
        SistemaReservas sistema = new SistemaReservas("Universidad Nacional");
        
        System.out.println(" INICIALIZANDO SISTEMA DE RESERVAS \n");
        
        // Crear usuarios (Estudiante y Profesor)
        Estudiante estudiante1 = new Estudiante(
            "Ana María López", 
            "EST001", 
            "ana.lopez@unal.edu.co",
            "Ingeniería de Sistemas",
            6
        );
        
        Profesor profesor1 = new Profesor(
            "Dr. Carlos Mendoza",
            "PROF001",
            "carlos.mendoza@unal.edu.co",
            "Ciencias de la Computación",
            "Inteligencia Artificial"
        );
        
        // Crear recursos (Sala y Cancha)
        Sala sala1 = new Sala(
            "Sala de Estudio A",
            "SALA-A01",
            "Edificio 401 - Piso 2",
            15,
            true
        );
        
        Cancha cancha1 = new Cancha(
            "Cancha Central",
            "CANCH-C01",
            "Zona Deportiva",
            "Fútbol",
            false
        );
        
        Sala sala2 = new Sala(
            "Sala de Conferencias",
            "SALA-C02",
            "Edificio 405 - Piso 1",
            50,
            true
        );
        
        // Crear reservas
        System.out.println("\n--- CREANDO RESERVAS ---\n");
        
        Reserva reserva1 = new Reserva(
            estudiante1,
            sala1,
            LocalDateTime.of(2025, 11, 25, 14, 0),
            2
        );
        sistema.agregarReserva(reserva1);
        
        Reserva reserva2 = new Reserva(
            profesor1,
            cancha1,
            LocalDateTime.of(2025, 11, 26, 16, 0),
            3
        );
        sistema.agregarReserva(reserva2);
        
        Reserva reserva3 = new Reserva(
            profesor1,
            sala2,
            LocalDateTime.of(2025, 11, 27, 10, 0),
            4
        );
        sistema.agregarReserva(reserva3);
        
        // Mostrar todas las reservas con información completa
        sistema.mostrarTodasLasReservas();
        
        // Demostrar métodos específicos de las clases derivadas
        System.out.println("\n=== DEMOSTRANDO MÉTODOS ESPECÍFICOS ===\n");
        
        System.out.println("--- Métodos de Estudiante ---");
        estudiante1.solicitarTutoria();
        
        System.out.println("\n--- Métodos de Profesor ---");
        profesor1.programarClase();
        
        System.out.println("\n--- Métodos de Sala ---");
        sala1.verificarEquipamiento();
        
        System.out.println("\n--- Métodos de Cancha ---");
        cancha1.realizarMantenimiento();
        
        // Mostrar reservas activas
        sistema.mostrarReservasActivas();
        
        // Cancelar una reserva y mostrar cambios
        System.out.println("\n--- CANCELANDO RESERVA ---\n");
        reserva2.cancelarReserva();
        
        sistema.mostrarReservasActivas();
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }    

}
