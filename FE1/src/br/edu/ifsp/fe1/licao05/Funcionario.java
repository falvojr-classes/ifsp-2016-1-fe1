package br.edu.ifsp.fe1.licao05;

/**
 * 2. Defina uma classe para modelar os funcionários do banco. Sabendo que todo
 * funcionário possui nome e salário, inclua os getters e setters de tais
 * atributos de instância.
 *
 * @author falvojr
 */
class Funcionario {

    private String nome;
    private double salario;

    /**
     * 8. Realize uma alteração na classe Funcionario, de maneira que todo
     * funcionário seja criado com seu respectivo nome e salário. Obtenha esse
     * comportamento através do conceito de construtores.
     *
     * @param nome
     * @param salario
     */
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        System.out.println("Super classe criada!");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * 6. Altere seu projeto de modo que imprima a bonificação de cada
     * funcionário, além dos dados que já estão sendo impressos.
     */
    protected void imprimirDados() {
        System.out.println(this.getNome());
        System.out.println(this.getSalario());
        double bonificacao = this.calculaBonificacao();
        System.out.println(bonificacao);
    }

    /**
     * 5. Suponha que todos os funcionários recebam uma bonificação de 10% do
     * salário. Acrescente o método calculaBonificacao() na classe Funcionario
     * que calcule e retorne essa bonificação.
     */
    public double calculaBonificacao() {
        double bonificacao = this.getSalario() * 0.10;
        return bonificacao;
    }
}
