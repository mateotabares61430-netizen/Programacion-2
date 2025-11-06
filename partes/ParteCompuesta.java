package partes;
public class ParteCompuesta extends Parte {
private double precioEnsamble;
private String descripcion;

    public ParteCompuesta(String numero, String nombre, double precioBase, double precioEnsamble, String descripcion){
    super(numero, nombre, precioBase);
    
    this.precioEnsamble = precioEnsamble;
    this.descripcion = descripcion;        
    }


    public double getPrecio(){
return this.precioBase + precioEnsamble * 0.011;        
}

}