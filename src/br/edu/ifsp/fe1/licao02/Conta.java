package br.edu.ifsp.fe1.licao02;

/**
 * 7. As contas do banco possuem número, saldo e limite. Crie uma classe para
 * definir os objetos que representarão as contas.
 *
 * @author falvojr
 */
class Conta {

    int numero;
    double saldo;
    double limite = 1000.0;

    /**
     * 13. Defina um vínculo entre os objetos que representam as agências e os
     * objetos que representam os contas. Para isso, você deve alterar a classe
     * Conta.
     */
    Agencia agencia;
}
