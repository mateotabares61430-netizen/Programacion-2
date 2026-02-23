package cuentabancaria;

public class CuentaBancaria {

// Atributos privados
    private String numeroCuenta;
    private int saldo;

    // Constructor 1: solo numeroCuenta, saldo inicia en 0
    public CuentaBancaria(String numeroCuenta) {
        this(numeroCuenta, 0); // llama al constructor 2
    }

    // Constructor 2: numeroCuenta + saldo inicial
    public CuentaBancaria(String numeroCuenta, int saldoInicial) {

        if (numeroCuenta == null || numeroCuenta.isEmpty()) {
            throw new IllegalArgumentException("El numero de cuenta no puede ser null ni estar vacio");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Depositar dinero (monto debe ser > 0)
    public void depositar(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor a 0");
        }
        this.saldo += monto;
    }

    // Retirar dinero → true si pudo, false si no hay saldo suficiente
    public boolean retirar(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor a 0");
        }
        if (monto > this.saldo) {
            return false; // No hay saldo suficiente
        }
        this.saldo -= monto;
        return true; // Retiro exitoso
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    // Representacion en texto
    @Override
    public String toString() {
        return "CuentaBancaria{" +
               "numeroCuenta='" + numeroCuenta + "'" +
               ", saldo=" + saldo +
               "}";
    }

}
