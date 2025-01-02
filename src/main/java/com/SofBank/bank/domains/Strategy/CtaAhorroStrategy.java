package main.java.com.SofBank.bank.domains.Strategy;

import main.java.com.SofBank.bank.domains.Strategy.Interfaces.ICalculoInteresStrategy;

public class CtaAhorroStrategy implements ICalculoInteresStrategy {

    @Override
    public double calcularInteres(double saldo, double tasaInteres) {
        return saldo * tasaInteres;
    }
}
