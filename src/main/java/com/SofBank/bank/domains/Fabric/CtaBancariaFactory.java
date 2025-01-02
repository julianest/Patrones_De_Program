package main.java.com.SofBank.bank.domains.Fabric;

import main.java.com.SofBank.bank.domains.models.CuentaBancaria;
import main.java.com.SofBank.bank.domains.models.TipoCuenta;

public abstract class CtaBancariaFactory {
    public abstract CuentaBancaria crearCuenta(String numeroCuenta, double saldo, double tasaInteres, TipoCuenta tipoCuenta);
}
