package br.edu.ifsp.fe1.licao06;

/**
 * 2. Defina uma classe genérica para modelar as contas do banco, possuindo
 * apenas o atributo de instância saldo.
 *
 * @author falvojr
 */
public class Conta {

    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
