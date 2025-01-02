package main.java.com.SofBank.bank.domains.Fabric.Interfaces;

import main.java.com.SofBank.bank.domains.models.TipoCuenta;
import main.java.com.SofBank.bank.domains.models.interfaces.ICuentaBancaria;

public interface ICtaBancariaFactory {
    ICuentaBancaria crearCuenta(String numeroCuenta, double saldo, double tasaInteres, TipoCuenta tipoCuenta);
}
