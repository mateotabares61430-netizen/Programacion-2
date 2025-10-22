import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
        // Crear la oficina
        OficinaDetectives elDestape = new OficinaDetectives("El Destape");
        
        // Contratar detectives
        Detective scobaDu = new Detective("Scoba Du", 5);
        Detective sherlockHolmes = new Detective("Sherlock Holmes", 10);
        elDestape.contratarDetective(scobaDu);
        elDestape.contratarDetective(sherlockHolmes);
        
        // Crear el caso "Nube azul"
        elDestape.crearCaso(8767, "Nube azul", scobaDu, 
                           "Sospecha de falsificación de firma en cheque");
        
        // Registrar sospechosos
        Sospechoso sospechoso1 = elDestape.buscarORegistrarSospechoso(
            "Juan Pérez", "El Rápido", 35, 
            "Calle 45 #12-34", "foto1.jpg", 
            "Altura media, cabello negro, cicatriz en la mejilla"
        );
        
        Sospechoso sospechoso2 = elDestape.buscarORegistrarSospechoso(
            "María García", null, 28, 
            "Avenida 68 #23-11", "foto2.jpg", 
            "Estatura baja, cabello rubio, tatuaje en el brazo"
        );
        
        // Agregar sospechosos al caso
        elDestape.agregarSospechosoACaso(8767, sospechoso1);
        elDestape.agregarSospechosoACaso(8767, sospechoso2);
        
        // Crear otro caso y reutilizar un sospechoso
        elDestape.crearCaso(8768, "Sombra Roja", sherlockHolmes, 
                           "Robo a joyería");
        
        // Intentar agregar el mismo sospechoso (ya está registrado)
        Sospechoso sospechosoRepetido = elDestape.buscarORegistrarSospechoso(
            "Juan Pérez", "El Rápido", 35, 
            "Calle 45 #12-34", "foto1.jpg", 
            "Altura media, cabello negro"
        );
        elDestape.agregarSospechosoACaso(8768, sospechosoRepetido);
        
        // Mostrar información
        elDestape.mostrarInformacion();
        
        // Buscar y mostrar caso específico
        Caso casoNubeAzul = elDestape.buscarCaso(8767);
        if (casoNubeAzul != null) {
            System.out.println("\n" + casoNubeAzul);
            System.out.println("Sospechosos en el caso:");
            for (Sospechoso s : casoNubeAzul.getSospechosos()) {
                System.out.println("  - " + s);
            }
        }
    }    

}

