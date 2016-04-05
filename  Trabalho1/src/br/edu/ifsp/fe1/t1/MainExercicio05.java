package br.edu.ifsp.fe1.t1;

/**
 * 5. Faça uma classe chamada MainExercicio05 e crie dois objetos da classe
 * Funcionario atribuindo valores a eles. Mostre na tela as informações desses
 * objetos.
 *
 * @author falvojr
 */
class MainExercicio05 {
    
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        Funcionario funcionario2 = new Funcionario("Funcionario 2");
        
        funcionario1.salario = 500;
        
        funcionario2.salario = 700;
        
        System.out.printf("%s\n%.2f\n\n", funcionario1.nome, funcionario1.salario);
        System.out.printf("%s\n%.2f\n\n", funcionario2.nome, funcionario2.salario);
    }
    
}
