public class p1_parcial1 {
    
}

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

// Enum para el estado del libro
enum EstadoLibro {
    DISPONIBLE,
    PRESTADO
}

// Clase Libro
class Libro {
    String titulo;
    String autor;
    String isbn;
    int numPaginas;
    EstadoLibro estado;

    public Libro(String titulo, String autor, String isbn, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.estado = EstadoLibro.DISPONIBLE;
    }

    public boolean estaDisponible() {
        return this.estado == EstadoLibro.DISPONIBLE;
    }

    public void prestar() {
        this.estado = EstadoLibro.PRESTADO;
    }

    public void devolver() {
        this.estado = EstadoLibro.DISPONIBLE;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " (" + estado + ")";
    }
}

// Clase Usuario
class Usuario {
    String nombre;
    String cedula;
    List<Prestamo> librosPrestados;
    static final int LIMITE_LIBROS = 3;

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.librosPrestados = new ArrayList<>();
    }

    public boolean puedePrestar() {
        return librosPrestados.size() < LIMITE_LIBROS;
    }

    public void agregarPrestamo(Prestamo p) {
        this.librosPrestados.add(p);
    }

    public void removerPrestamo(Prestamo p) {
        this.librosPrestados.remove(p);
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " (Libros prestados: " + librosPrestados.size() + ")";
    }
}

// Clase Prestamo
class Prestamo {
    Usuario usuario;
    Libro libro;
    LocalDate fechaPrestamo;
    LocalDate fechaDevolucion;
    double multa;
    static final int DIAS_GRACIA = 15;
    static final double VALOR_MULTA_DIA = 2000.0;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaPrestamo) { // Añadido fechaPrestamo para simulación
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
        this.multa = 0.0;
    }

    public boolean realizarPrestamo() {
        if (libro.estaDisponible() && usuario.puedePrestar()) {
            libro.prestar();
            usuario.agregarPrestamo(this);
            return true;
        }
        return false;
    }

    public void devolverLibro(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        this.libro.devolver();
        this.usuario.removerPrestamo(this);
        this.multa = calcularMulta();
    }

    public long calcularDiasTranscurridos() {
        return ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
    }

    public double calcularMulta() {
        long diasTranscurridos = calcularDiasTranscurridos();
        if (diasTranscurridos > DIAS_GRACIA) {
            long diasAdicionales = diasTranscurridos - DIAS_GRACIA;
            return diasAdicionales * VALOR_MULTA_DIA;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Préstamo: " + libro.titulo + " a " + usuario.nombre +
               " (Prestado: " + fechaPrestamo + ", Devuelto: " + fechaDevolucion +
               ", Multa: $" + multa + ")";
    }
}

public class p1_parcial1 {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "G.G.Márquez", "111", 496);
        Libro libro2 = new Libro("El Principito", "A.S.Exupéry", "222", 96);

        // Crear usuarios
        Usuario ana = new Usuario("Ana Garcia", "123");
        Usuario pedro = new Usuario("Pedro Lopez", "456");

        System.out.println("--- Simulación de Préstamos ---");

        // Préstamo 1: Ana presta libro1
        Prestamo p1 = new Prestamo(ana, libro1, LocalDate.of(2023, 1, 5));
        if (p1.realizarPrestamo()) {
            System.out.println("Préstamo exitoso: " + p1.libro.titulo + " a " + p1.usuario.nombre);
        } else {
            System.out.println("Fallo el préstamo de " + p1.libro.titulo);
        }

        // Préstamo 2: Pedro presta libro2
        Prestamo p2 = new Prestamo(pedro, libro2, LocalDate.of(2023, 1, 1));
        if (p2.realizarPrestamo()) {
            System.out.println("Préstamo exitoso: " + p2.libro.titulo + " a " + p2.usuario.nombre);
        } else {
            System.out.println("Fallo el préstamo de " + p2.libro.titulo);
        }

        Prestamo p3 = new Prestamo(pedro, libro2, LocalDate.of(2023, 1, 1));
        if (p2.realizarPrestamo()) {
            System.out.println("Préstamo exitoso: " + p3.libro.titulo + " a " + p3.usuario.nombre);
        } else {
            System.out.println("Fallo el préstamo de " + p2.libro.titulo);
        }

        System.out.println("\n--- Estado actual ---");
        System.out.println(ana);
        System.out.println(pedro);
        System.out.println(libro1);
        System.out.println(libro2);

        // Devolución 1: Pedro devuelve libro2 con multa
        System.out.println("\n--- Devolución con multa ---");
        LocalDate fechaDevolucionPedro = LocalDate.of(2023, 1, 20); // 19 días después del préstamo (1/1)
        p2.devolverLibro(fechaDevolucionPedro);
        System.out.println(p2); // Mostrar detalles del préstamo con multa

        System.out.println("\n--- Estado después de devolución ---");
        System.out.println(pedro);
        System.out.println(libro2);

        // Devolución 2: Ana devuelve libro1 sin multa
        System.out.println("\n--- Devolución sin multa ---");
        LocalDate fechaDevolucionAna = LocalDate.of(2023, 1, 10); // 5 días después del préstamo (5/1)
        p1.devolverLibro(fechaDevolucionAna);
        System.out.println(p1); // Mostrar detalles del préstamo sin multa

        System.out.println("\n--- Estado final ---");
        System.out.println(ana);
        System.out.println(libro1);
    }
}