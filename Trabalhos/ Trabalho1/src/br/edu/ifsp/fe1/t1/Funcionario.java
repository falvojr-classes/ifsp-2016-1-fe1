package br.edu.ifsp.fe1.t1;

/**
 * 4. Em uma escola, além dos alunos temos os funcionários, que também precisam
 * ser representados em nossa aplicação. Então implemente outra classe chamada
 * Funcionario que contenha dois atributos: o primeiro para o nome e o segundo
 * para o salário dos funcionários.
 *
 * 10. Adicione na classe Funcionario dois métodos: um para aumentar o salário
 * (considerando uma porcentagem de aumento) e outro para consultar os dados dos
 * funcionários (imprimindo seus atributos).
 *
 * @author falvojr
 */
class Funcionario {

    String nome;
    double salario;

    /**
     * 14.c. Todo Funcionário deve ser criado com seu respectivo nome.
     *
     * @param nome
     */
    public Funcionario(String nome) {
        this.nome = nome;
    }

    void aumentaSalario(double porcentagem) {
        // Regra criada apenas como exemplo...
        if (porcentagem <= 1.05 && porcentagem > 1) {
            this.salario *= porcentagem;
        } else {
            System.err.printf("%.2f de aumento nao eh permitido!", porcentagem);
        }
    }

    void imprimeDados() {
        System.out.printf("Dados do Funcionario:\n%s\n%.2f\n\n", this.nome, this.salario);
    }

    /**
     * 12. Crie mais um método de aumento de salário (sobrecarga), fazendo com
     * que a classe Funcionario possua as seguintes variações: Aumenta o salário
     * do Funcionario considerando uma porcentagem variável (exercício 10);
     * Aumenta o salário do Funcionario considerando 8,25%;
     *
     */
    void aumentaSalario() {
        this.aumentaSalario(1.0825);
    }
}
