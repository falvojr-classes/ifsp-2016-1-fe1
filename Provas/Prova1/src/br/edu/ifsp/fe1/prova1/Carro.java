package br.edu.ifsp.fe1.prova1;

/**
 *
 * @author falvojr
 */
public class Carro {

    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }
    
    void liga() {
        System.out.println("Carro ligado e pronto para acelerar!");
    }
    
    void acelera(double quantidade) {
        this.velocidadeAtual += quantidade;
    }
    
    void acelera() {
       // this.velocidadeAtual += 10;
       // ou
       this.acelera(10);
    }
}
