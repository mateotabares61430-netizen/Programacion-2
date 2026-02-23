package carrito;

import producto.Producto;

public class MainCarrito {
 
public static void main(String[] args) {

        System.out.println("=== PRUEBA CARRITO ===\n");

        // Crear 4 productos diferentes
        Producto prod1 = new Producto("P001", "Manzana",  1500.0, 10);
        Producto prod2 = new Producto("P002", "Pera",     2000.0,  5);
        Producto prod3 = new Producto("P003", "Naranja",  1200.0,  8);
        Producto prod4 = new Producto("P004", "Banano",    800.0, 20);

        System.out.println("Productos creados:");
        System.out.println("  " + prod1);
        System.out.println("  " + prod2);
        System.out.println("  " + prod3);
        System.out.println("  " + prod4);

        // Crear carrito y agregar los 3 primeros → deben retornar true
        Carrito carrito = new Carrito();
        System.out.println("\n--- Agregando productos ---");

        boolean r1 = carrito.agregar(prod1);
        System.out.println("Agregar Manzana  → " + r1); // true

        boolean r2 = carrito.agregar(prod2);
        System.out.println("Agregar Pera     → " + r2); // true

        boolean r3 = carrito.agregar(prod3);
        System.out.println("Agregar Naranja  → " + r3); // true

        // Agregar el 4to → debe retornar false
        boolean r4 = carrito.agregar(prod4);
        System.out.println("Agregar Banano   → " + r4); // false (carrito lleno)

        // Mostrar totalInventario()
        System.out.println("\n--- Total Inventario ---");
        System.out.println("Total: " + carrito.totalInventario());
        // Manzana: 1500*10=15000 | Pera: 2000*5=10000 | Naranja: 1200*8=9600
        // Total esperado: 34600.0

        // Mostrar cantidadProductos()
        System.out.println("\n--- Cantidad de Productos ---");
        System.out.println("Slots ocupados: " + carrito.cantidadProductos()); // 3

        // intentar agregar null → false
        System.out.println("\n--- Intentar agregar null ---");
        boolean rNull = carrito.agregar(null);
        System.out.println("Agregar null → " + rNull); // false

        // Estado final del carrito
        System.out.println("\n--- Estado final del carrito ---");
        System.out.println(carrito);
    }
}