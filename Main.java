import java.util.InputMismatchException;

public class Main {
public static void main(String[] args) {
System.out.println("Hello, world !")   
    
public static void mayorEnMatriz() {
        int[] matriz = {1, 2, 3, 4, 5};
        int mayor = matriz[0];

        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i] > mayor) {
                mayor = matriz[i];
            }
        }

        System.out.println("El número mayor en la matriz es: " + mayor);
    }

    public static void calcularMCD() {
        int a, b;
        try {
            System.out.print("Ingresa el primer número: ");
            a = Math.abs(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Ingresa el segundo número: ");
            b = Math.abs(scanner.nextInt());
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingresa números enteros.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("El MCD es: " + a);
    }

    public static void mostrarPares() {
        System.out.println("Números pares del 1 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void tablaMultiplicar() {
        int num = 8;
        System.out.println("Tabla de multiplicar del 8:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void mayorDeCinco() {
        int[] numeros = new int[5];
        System.out.println("Ingresa 5 números:");
        boolean validInput = true;

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                scanner.nextLine(); // Consume the invalid input
                validInput = false;
                break;
            }
        }

        if (!validInput) {
            return; // Exit if invalid input was provided
        }

        boolean todosIguales = true;
        for (int i = 1; i < 5; i++) {
            if (numeros[i] != numeros[0]) {
                todosIguales = false;
                break;
            }
        }

        if (todosIguales) {
            System.out.println("Todos los números son iguales.");
        } else {
            int mayor = numeros[0];
            for (int i = 1; i < 5; i++) {
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }
            }
            System.out.println("El número mayor es: " + mayor);
        }
    }

    public static void clasificarEdad() {
        int edad;
        try {
            System.out.print("Ingrese la edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingresa un número entero para la edad.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }

        if (edad >= 0 && edad <= 12) {
            System.out.println("Es un niño");
        } else if (edad <= 17) {
            System.out.println("Es un adolescente");
        } else if (edad <= 64) {
            System.out.println("Es un adulto");
        } else if (edad > 64) {
            System.out.println("Es un adulto mayor");
        } else {
            System.out.println("Edad inválida (no puede ser negativa).");
        }
    }

    public static void ejercicio1() {
        int numero;
        try {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }

        boolean esImpar = numero % 2 != 0;
        System.out.println("¿Es impar? " + esImpar);
    }

    public static void contarVocales() {
        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine(); // Use nextLine() directly as it's intended for strings

        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }

    public static void factorial() {
        int n;
        try {
            System.out.print("Ingrese un número entero: ");
            n = scanner.nextInt(); // Use nextInt() here for integer input
            scanner.nextLine(); // Consume the newline character
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return;
        }

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        System.out.println("El factorial de " + n + " es: " + resultado);
    }

    public static void compararNumeros() {
        int a, b;
        try {
            System.out.print("Ingrese el primer número: ");
            a = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el segundo número: ");
            b = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingresa números enteros.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }

    public static void validarNumero() {
        int n;
        try {
            System.out.print("Ingrese un número: ");
            n = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }

        if (n > 0) {
            System.out.println("El número es positivo");
        } else if (n < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

    }
}