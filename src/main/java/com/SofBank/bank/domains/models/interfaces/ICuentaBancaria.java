package main.java.com.SofBank.bank.domains.models.interfaces;

public interface ICuentaBancaria {
    void depositar(double monto);
    double retirar(double monto);
    void mostrarEstadoCuenta();
    //double obtenerSaldo();
}
