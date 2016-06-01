package br.edu.ifsp.fe1.licao06;

/**
 * 6. Defina uma classe para modelar de forma genérica os funcionários do banco.
 * A classe Funcionario deve possuir os seguintes atributos de instância: nome e
 * salário.
 *
 * 10. Utilizando construtores, faça com que todos os funcionários possam ser
 * criados do modo padrão e também recebendo um nome como parâmetro, ou seja,
 * haverá uma sobrecarga de construtores. Teste essa implementação em sua classe
 * de testes.
 *
 * @author falvojr
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
        super();
    }
    
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
