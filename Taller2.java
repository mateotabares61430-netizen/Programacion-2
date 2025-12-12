import javax.swing.JOptionPane;
import java.util.Scanner;


public class Taller2 {

class Rectangulo {
    double base;
    double altura;
    
    double calcularArea() {
        return base * altura;
    }
    
    double calcularPerimetro() {
        return 2 * (base + altura);
    }
}


class Bascula {
    
    double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }
}


public class Punto1 {
    public static void main(String[] args) {
     
        System.out.println("RECTANGULO");
        Rectangulo rect = new Rectangulo();
        rect.base = 5.0;
        rect.altura = 3.0;
        
        System.out.println("Base: " + rect.base);
        System.out.println("Altura: " + rect.altura);
        System.out.println("Area: " + rect.calcularArea());
        System.out.println("Perimetro: " + rect.calcularPerimetro());
        
       
        System.out.println(" BASCULA ");
        Bascula bascula = new Bascula();
        double peso = 70.0;
        double estatura = 1.75;
        double imc = bascula.calcularIMC(peso, estatura);
        
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("IMC: " + imc);
    }
}    

    class Calculadora {
    double numero1;
    double numero2;
    
    double sumar() {
        return numero1 + numero2;
    }
    
    double restar() {
        return numero1 - numero2;
    }
    
    double multiplicar() {
        return numero1 * numero2;
    }
    
    double dividir() {
        return numero1 / numero2;
    }
}

    public class Punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        
       
        Calculadora calc = new Calculadora();
        calc.numero1 = num1;
        calc.numero2 = num2;
        
   
        System.out.println("OPERACIONES");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Elija una operacion (1-4): ");
        
        int opcion = scanner.nextInt();
        double resultado = 0;
        String mensaje = "";
        
        
        if (opcion == 1) {
            resultado = calc.sumar();
            mensaje = "Suma\n" + num1 + " + " + num2 + " = " + resultado;
        }
        
        if (opcion == 2) {
            resultado = calc.restar();
            mensaje = "Resta\n" + num1 + " - " + num2 + " = " + resultado;
        }
        
        if (opcion == 3) {
            resultado = calc.multiplicar();
            mensaje = "Multiplicacion\n" + num1 + " x " + num2 + " = " + resultado;
        }
        
        if (opcion == 4) {
            resultado = calc.dividir();
            mensaje = "Division\n" + num1 + " / " + num2 + " = " + resultado;
        }
        
        
        JOptionPane.showMessageDialog(null, mensaje);
        
    }

    }

    class Estudiante {
    String nombre;
    int edad;
    double notaFinal;
    
    String obtenerEstado() {
        if (notaFinal >= 3.0) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }
}

public class Punto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" REGISTRO DE ESTUDIANTE");
        
      
        Estudiante estudiante = new Estudiante();
        
       
        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante.nombre = scanner.nextLine();
        
      
        System.out.print("Ingrese la edad del estudiante: ");
        estudiante.edad = scanner.nextInt();
        
    
        System.out.print("Ingrese la nota final (0.0 - 5.0): ");
        estudiante.notaFinal = scanner.nextDouble();
        
    
        String mensaje = "=== INFORMACION DEL ESTUDIANTE ===\n\n";
        mensaje = mensaje + "Nombre: " + estudiante.nombre + "\n";
        mensaje = mensaje + "Edad: " + estudiante.edad + " años\n";
        mensaje = mensaje + "Nota Final: " + estudiante.notaFinal + "\n";
        mensaje = mensaje + "Estado: " + estudiante.obtenerEstado();
        
        
        JOptionPane.showMessageDialog(null, mensaje);
        
        System.out.println("\nDatos registrados exitosamente!");
        
        scanner.close();
    }

}



}
