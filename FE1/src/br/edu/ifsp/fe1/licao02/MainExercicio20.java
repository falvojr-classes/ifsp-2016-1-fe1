package br.edu.ifsp.fe1.licao02;

/**
 * 20. Teste os métodos de aumento salarial definidos na classe Gerente.
 *
 * @author falvojr
 */
public class MainExercicio20 {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.salario = 1000;
        
        gerente.aumentaSalario();
        gerente.aumentaSalario(1.2);
        
        System.out.println(gerente.salario);
    }
}
