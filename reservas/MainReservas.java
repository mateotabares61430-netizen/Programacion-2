package reservas;
import java.time.LocalDateTime;

public class MainReservas {

    public static void main(String[] args) {

        // Inicializar sistema
        SistemaReservas sistema = new SistemaReservas("Universidad de Caldas");
        
        System.out.println(" INICIALIZANDO SISTEMA DE RESERVAS \n");
        
        // Creación de usuarios (o sea estudiantes :3)
        Estudiante estudiante1 = new Estudiante(
            "David Gilmour", 
            "EST001", 
            "david.gilmour@caldas.edu.co",
            "Licenciatura en Biología y Química",
            6
        );
        
        Estudiante estudiante2 = new Estudiante(
            "Daniel Alejandro Aguirre", 
            "EST002", 
            "daniel.aguirre@ucaldas.edu.co",
            "Ingieniería de Alimentos",
            5
        );
        
        // Creación de recursos (o sea canchas a reservar por estudiantes :v)
        
        Cancha cancha1 = new Cancha(
            "Cancha Monumento",
            "C01",
            "Campus Deportivo",
            "Fútbol",
            true
        );
        
        Cancha cancha2 = new Cancha(
            "Cancha Trasera",
            "C02",
            "Zona Parking",
            "Tenis",
            false
        );
        
        
        // Creación de las reservas con su respectiva fecha y duración :3
        System.out.println("\n CREANDO RESERVAS \n");
        
        Reserva reserva1 = new Reserva(
            estudiante1,
            cancha1,
            LocalDateTime.of(2025, 11, 25, 14, 0),
            2
        );
        sistema.agregarReserva(reserva1);
        
        Reserva reserva2 = new Reserva(
            estudiante2,
            cancha2,
            LocalDateTime.of(2025, 12, 15, 18, 0),
            3
        );
        sistema.agregarReserva(reserva2);
        
        
        // Método para mostras todas las reservas con información detallada :3
        sistema.mostrarTodasLasReservas();
        
        // Método para mostrar reservas activas
        sistema.mostrarReservasActivas();
        
        // Método para cancelar una reserva (a manera de prueba) y mostrar las que quedan activas :3
        System.out.println("\n CANCELANDO RESERVA \n");
        reserva2.cancelarReserva();
        
        //Como ya se indicó previamente, mostrar las activas después de las canceladas
        sistema.mostrarReservasActivas();
        
    }    

}
