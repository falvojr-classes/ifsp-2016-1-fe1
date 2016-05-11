package br.edu.ifsp.fe1.licao04;

/**
 * 11. Crie as classes Clube e Jogador, elas representarão tais entidades em uma
 * aplicação para controle de finanças de clubes. A classe Clube deve possuir os
 * atributos de instância nome e saldo. A classe Jogador, por sua vez, deve
 * possuir nome, posição, numero, salário, felicidade (atributo do tipo boolean)
 * e clube.
 *
 * @author falvojr
 */
class Clube {
    private String nome;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
