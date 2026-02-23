package carrito;

import producto.Producto;

public class Carrito {


    private Producto p1;
    private Producto p2;
    private Producto p3;

  
    public Carrito() {
        this.p1 = null;
        this.p2 = null;
        this.p3 = null;
    }

    // Agregar producto → true si lo agrega, false si está lleno o p es null
    public boolean agregar(Producto p) {
        if (p == null) {
            return false; // No se permite agregar null
        }

        if (p1 == null) {
            p1 = p;
            return true;
        } else if (p2 == null) {
            p2 = p;
            return true;
        } else if (p3 == null) {
            p3 = p;
            return true;
        }

        return false; // Carrito lleno
    }

    // Suma el valorInventario() de todos los productos no nulos
    public double totalInventario() {
        double total = 0;

        if (p1 != null) total += p1.valorInventario();
        if (p2 != null) total += p2.valorInventario();
        if (p3 != null) total += p3.valorInventario();

        return total;
    }

    // Retorna cuántos slots están ocupados
    public int cantidadProductos() {
        int cantidad = 0;

        if (p1 != null) cantidad++;
        if (p2 != null) cantidad++;
        if (p3 != null) cantidad++;

        return cantidad;
    }

    // Representacion en texto
    @Override
    public String toString() {
        return "Carrito{" +
               "\n  p1=" + p1 +
               "\n  p2=" + p2 +
               "\n  p3=" + p3 +
               "\n}";
    }
    

}
