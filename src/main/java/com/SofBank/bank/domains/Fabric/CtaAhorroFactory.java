package main.java.com.SofBank.bank.domains.Fabric;

import main.java.com.SofBank.bank.domains.Fabric.Interfaces.ICtaBancariaFactory;
import main.java.com.SofBank.bank.domains.models.CuentaAhorro;
import main.java.com.SofBank.bank.domains.models.CuentaBancaria;
import main.java.com.SofBank.bank.domains.models.TipoCuenta;

public class CtaAhorroFactory extends CtaBancariaFactory implements ICtaBancariaFactory {

    @Override
    public CuentaBancaria crearCuenta(String numeroCuenta, double saldo, double tasaInteres, TipoCuenta tipoCuenta) {
        if(tipoCuenta != TipoCuenta.AHORRO){
            throw new IllegalArgumentException("El tipo de cuenta no coincide con esta fábrica.");
        }
        return new CuentaAhorro(numeroCuenta, saldo,tasaInteres);
    }
}
