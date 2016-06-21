package br.edu.ifsp.fe1.t1;

/**
 * 11. Em uma nova classe teste os métodos criados em um objeto da classe
 * Funcionario.
 *
 * @author falvojr
 */
public class MainExercicio11 {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionario Promovido");
        funcionario.salario = 1000;
        
        funcionario.aumentaSalario(1.05);
        funcionario.aumentaSalario();
        funcionario.imprimeDados();
    }
    
}
