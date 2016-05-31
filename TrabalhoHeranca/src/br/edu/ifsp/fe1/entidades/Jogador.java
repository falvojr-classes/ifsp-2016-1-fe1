package br.edu.ifsp.fe1.entidades;

/**
 * Sub classe que representa o funcionario do tipo Jogador.
 *
 * @author falvojr
 */
public class Jogador extends Funcionario {

    private static int contador;
    
    private String posicao;
    private int numero;

    public Jogador(double salario, Clube clube) {
        super(salario, clube);
        Jogador.contador++;
    }

    public static int getContador() {
        return Jogador.contador;
    }
    
    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public void receberSalario() {
        double salarioJogador = super.getSalario() * 1.03;
        super.receberSalario(salarioJogador);
    }
}
