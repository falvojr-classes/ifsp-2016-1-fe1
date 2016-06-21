package br.edu.ifsp.fe1.entidades;

/**
 * Super classe com os atributos e metodos comuns a funcionarios.
 *
 * 13. Usando o conceito de atributos de classe, implemente uma lógica que conte
 * quantos funcionários (independentemente de tipo) foram criados em seu
 * programa.
 *
 * @author falvojr
 */
public class Funcionario {

    private static int contador;
    
    private String nome;
    private double salario;
    private boolean feliz;
    private Clube clube;

    public Funcionario(double salario, Clube clube) {
        this.salario = salario;
        this.clube = clube;
        Funcionario.contador++;
    }

    public static int getContador() {
        return Funcionario.contador;
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

    public boolean isFeliz() {
        return feliz;
    }

    public void setFeliz(boolean feliz) {
        this.feliz = feliz;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public void receberSalario() {
        double salarioFuncionario = this.getSalario();
        this.receberSalario(salarioFuncionario);
    }

    protected void receberSalario(double salario) {
        if (this.getClube().getSaldo() < salario) {
            this.setFeliz(false);
        } else {
            double novoSaldo = this.getClube().getSaldo() - salario;
            this.getClube().setSaldo(novoSaldo);
            this.setFeliz(true);
        }
    }
}
