package br.edu.ifsp.fe1.licao06;

/**
 * 7. Implemente duas classes específicas para modelar dois tipos particulares
 * de funcionários do banco: Gerente (possui os atributos usuario e senha) e
 * Telefonista (possui um código numérico para sua estação de trabalho).
 *
 * @author falvojr
 */
public class Telefonista extends Funcionario {

    private int codigoEstacaoTrabalho;

    public Telefonista() {
        super();
    }

    public Telefonista(String nome) {
        super(nome);
    }
    
    public int getCodigoEstacaoTrabalho() {
        return codigoEstacaoTrabalho;
    }

    public void setCodigoEstacaoTrabalho(int codigoEstacaoTrabalho) {
        this.codigoEstacaoTrabalho = codigoEstacaoTrabalho;
    }

}
