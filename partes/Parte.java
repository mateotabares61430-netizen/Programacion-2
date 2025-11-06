package partes;
public class Parte {
protected String numero;
protected String nombre;
protected double precioBase;

Parte(String numero, String nombre, double precioBase) {
        this.numero = numero;
        this.nombre = nombre;
        this.precioBase = precioBase;
        
}

public double getPrecio(){
return this.precioBase;

    }    

}
    

