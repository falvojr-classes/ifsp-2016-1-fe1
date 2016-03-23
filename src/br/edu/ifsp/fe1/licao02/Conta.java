package br.edu.ifsp.fe1.licao02;

/**
 * 7. As contas do banco possuem número, saldo e limite. Crie uma classe para
 * definir os objetos que representarão as contas.
 *
 * 13. Defina um vínculo entre os objetos que representam as agências e os
 * objetos que representam os contas. Para isso, você deve alterar a classe
 * Conta.
 *
 * 17. Acrescente alguns métodos na classe Conta para realizar as operações de
 * deposito, saque, impressão de extrato e consulta do saldo disponível.
 *
 * @author falvojr
 */
class Conta {

    int numero;
    double saldo;
    double limite = 500.0;
    Agencia agencia;

    void deposita(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    void saca(double valorSaque) {
        this.saldo -= valorSaque;
    }
}
