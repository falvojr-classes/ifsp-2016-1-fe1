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
    
    protected void imprimirDados() {
        System.out.println(this.getNome());
        System.out.println(this.getSalario());
    }
}
