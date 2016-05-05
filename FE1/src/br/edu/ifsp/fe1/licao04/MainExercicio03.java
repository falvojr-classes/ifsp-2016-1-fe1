package br.edu.ifsp.fe1.licao04;

/**
 * 3. Teste a classe Funcionario criando um objeto e manipulando diretamente os
 * seus atributos.
 *
 * 4. Compile a classe de testes e perceba que ela pode acessar ou modificar os
 * valores dos atributos de um objeto da classe Funcionario. Execute o teste e
 * observe o console.
 *
 * 8. Altere a classe Teste para que ela utilize os métodos de acesso ao invés
 * de manipular os atributos do objeto da classe Funcionario diretamente.
 *
 * @author falvojr
 */
public class MainExercicio03 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Funcionario 1");
        funcionario.setSalario(1500.25);

        funcionario.getSalario();

        double salarioFuncionario = funcionario.getSalario();
        System.out.println("Salario " + salarioFuncionario);
    }
}
