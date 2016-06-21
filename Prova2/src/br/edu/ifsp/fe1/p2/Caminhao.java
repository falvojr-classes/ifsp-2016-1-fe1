package br.edu.ifsp.fe1.p2;

/**
 *
 * @author falvojr
 */
public class Caminhao extends Veiculo {

    private int numeroEixos;

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    @Override
    protected double getPorcentagemIPVA() {
        return 4.0;
    }
}
