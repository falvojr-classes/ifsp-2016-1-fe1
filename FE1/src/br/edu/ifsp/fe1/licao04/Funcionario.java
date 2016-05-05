package br.edu.ifsp.fe1.licao04;

/**
 * 2. Defina uma classe para representar os funcionários do banco com um
 * atributo para guardar os salários e outro para os nomes.
 *
 * 5. Aplique a ideia do encapsulamento tornando os atributos definidos na
 * classe Funcionario privados.
 *
 * 7. Crie métodos de acesso com nomes padronizados para os atributos definidos
 * na classe Funcionario.
 *
 * @author falvojr
 */
public class Funcionario {
    private String nome;
    private double salario;
    private boolean gerente;

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

    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
}
