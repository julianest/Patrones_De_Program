package main.java.com.SofBank.bank.domains.app;

import main.java.com.SofBank.bank.domains.Fabric.CtaAhorroFactory;
import main.java.com.SofBank.bank.domains.Fabric.CtaCorrienteFactory;
import main.java.com.SofBank.bank.domains.Fabric.Interfaces.ICtaBancariaFactory;
import main.java.com.SofBank.bank.domains.models.TipoCuenta;
import main.java.com.SofBank.bank.domains.models.interfaces.ICuentaBancaria;
import main.java.com.SofBank.bank.infraestructure.logging.TransactionLogger;

public class Main {
    public static void main(String[] args) {

    /*Primer ejercicio
        // Creamos la instancia de main.java.com.SofBank.bank.domains.models.CuentaBancaria con número de cuenta y saldo inicial
        main.java.com.SofBank.bank.domains.models.CuentaAhorro cuenta = new main.java.com.SofBank.bank.domains.models.CuentaAhorro("123456789", 1000.0, 0.089);
        // Ej: 1. Realizamos un depósito de 500
        cuenta.depositar(500.0);
        // Ej: 2. Realizamos un retiro de 300
        //cuenta.retirar(300.0);
        // Ej: 3. Intentamos retirar más dinero del que hay en la cuenta 1600 (Imposible).
        //cuenta.retirar(1600.0);
        cuenta.mostrarEstadoCuenta();
        //Abstraccion: Se tiene acceso a lo necesario, ocultando los detalles internos de las funcionalidades (depositar, retirar y saldo).
     */

    //Segundo Ejercicio "Patrones"
       ICtaBancariaFactory ctaAhorroFactory = new CtaAhorroFactory(); //Factory
       ICtaBancariaFactory ctaCorrienteFactory = new CtaCorrienteFactory(); //Factory

       ICuentaBancaria cuentaAhorro = ctaAhorroFactory.crearCuenta("111111111", 1000, 0.087, TipoCuenta.AHORRO);

        cuentaAhorro.depositar(700.0);
        cuentaAhorro.retirar(200);
        cuentaAhorro.depositar(300);
        cuentaAhorro.mostrarEstadoCuenta();

        ICuentaBancaria cuentaCorriente = ctaCorrienteFactory.crearCuenta("222222222", 500, 0.087, TipoCuenta.CORRIENTE);
        cuentaCorriente.retirar(200);
        cuentaCorriente.depositar(50);
        cuentaCorriente.mostrarEstadoCuenta();

        System.out.println("\n-----------------------\nTransacciones registradas:\n");
        TransactionLogger.getInstance().getTransacciones().forEach(System.out::println);

    }
}


