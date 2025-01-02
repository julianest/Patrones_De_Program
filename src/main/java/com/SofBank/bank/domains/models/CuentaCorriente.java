package main.java.com.SofBank.bank.domains.models;

import main.java.com.SofBank.bank.domains.Strategy.CtaCorrienteStrategy;
import main.java.com.SofBank.bank.domains.Strategy.Interfaces.ICalculoInteresStrategy;

public class CuentaCorriente extends CuentaBancaria{


    private double tasaInteres;
    private ICalculoInteresStrategy estrategiaCalculoInteres;

    public CuentaCorriente(String numeroCuenta, double saldo, double tasaInteres){
        super(numeroCuenta,saldo, TipoCuenta.CORRIENTE);
        this.tasaInteres = tasaInteres;
        this.estrategiaCalculoInteres = new CtaCorrienteStrategy();
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        aplicarTasaInteres();
    }
    
    public void aplicarTasaInteres(){
        double interes = estrategiaCalculoInteres.calcularInteres(getSaldo(),tasaInteres); //getSaldo() * tasaInteres;
        setInteresAcumulado(getInteresAcumulado() + interes) ;
        setSaldo(getSaldo()+interes);
        //System.out.println(" Intereses Aplicados: $"+ interes);
    }


    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        if (tasaInteres < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }
        this.tasaInteres = tasaInteres;
    }
}
