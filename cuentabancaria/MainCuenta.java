package cuentabancaria;

public class MainCuenta {

public static void main(String[] args) {

        System.out.println("=== PRUEBA CUENTA BANCARIA ===\n");

        // Crear cuenta con saldo inicial 0 (constructor 1)
        CuentaBancaria cuenta1 = new CuentaBancaria("CB-001");
        System.out.println("Cuenta creada: " + cuenta1);

        // Crear cuenta con saldo inicial (constructor 2)
        CuentaBancaria cuenta2 = new CuentaBancaria("CB-002", 5000);
        System.out.println("Cuenta creada: " + cuenta2);

        System.out.println("\n--- Depositar correctamente ---");
        cuenta1.depositar(2000);
        System.out.println("Deposité 2000 → Saldo actual: " + cuenta1.getSaldo()); // 2000

        System.out.println("\n--- Retirar correctamente ---");
        boolean retiro1 = cuenta1.retirar(500);
        System.out.println("Retiré 500 → Exitoso: " + retiro1);                   // true
        System.out.println("Saldo actual: " + cuenta1.getSaldo());                 // 1500

        System.out.println("\n--- Retirar más de lo que hay ---");
        boolean retiro2 = cuenta1.retirar(9999);
        System.out.println("Intenté retirar 9999 → Exitoso: " + retiro2);         // false
        System.out.println("Saldo sin cambios: " + cuenta1.getSaldo());            // 1500

        System.out.println("\n--- Depositar 0 o negativo → excepcion ---");
        try {
            cuenta1.depositar(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado al depositar 0: " + e.getMessage());
        }

        try {
            cuenta1.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado al depositar -100: " + e.getMessage());
        }

        System.out.println("\n--- Estado final ---");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}


