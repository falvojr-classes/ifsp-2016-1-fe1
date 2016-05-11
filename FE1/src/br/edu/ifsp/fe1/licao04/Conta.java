package br.edu.ifsp.fe1.licao04;

/**
 *
 * @author falvojr
 */
class Conta {

    private int numero;
    private double saldo;
    private double limite = 200;
    private Agencia agencia;

    private static int contador = 0;

    public static int getContador() {
        return Conta.contador;
    }

    public Conta() {
        Conta.contador++;
        if (Conta.contador == 100) {
            this.saldo = 50;
            Conta.contador = 0;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void saca(double valor) {
        this.saldo -= valor;
        this.descontaTarifa();
    }

    public void deposita(double valor) {
        this.saldo += valor;
        this.descontaTarifa();
    }

    private void descontaTarifa() {
        this.saldo -= 0.20;
    }
}
