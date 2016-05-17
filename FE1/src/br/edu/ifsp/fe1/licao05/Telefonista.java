package br.edu.ifsp.fe1.licao05;

/**
 *
 * @author falvojr
 */
class Telefonista extends Funcionario {

    private int codigoEstacaoTrabalho;

    public int getCodigoEstacaoTrabalho() {
        return codigoEstacaoTrabalho;
    }

    public void setCodigoEstacaoTrabalho(int codigoEstacaoTrabalho) {
        this.codigoEstacaoTrabalho = codigoEstacaoTrabalho;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println(this.getCodigoEstacaoTrabalho());
        System.out.println();
    }
}
