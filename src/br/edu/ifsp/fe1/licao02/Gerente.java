package br.edu.ifsp.fe1.licao02;

/**
 * 19. Crie uma classe chamada Gerente para definir os objetos que representarão
 * os gerentes do banco. Defina dois métodos de aumento salarial nessa classe. O
 * primeiro deve aumentar o salário com uma taxa fixa de 10%. O segundo deve
 * aumentar o salário com uma taxa variável.
 *
 * @author falvojr
 */
public class Gerente {

    double salario;
    /**
     * Método que aplica um aumento de 10% sobre o salário.
     */
    void aumentaSalario() {
        this.aumentaSalario(1.1);
    }
    
    /**
     * Método que aplica um aumento parametrizado sobre o salário.
     * 
     * @param taxa Taxa de aumento, por exemplo 1.1 = 10%.
     */
    void aumentaSalario(double taxa) {
        this.salario *= taxa;
    }
}
