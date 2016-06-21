package br.edu.ifsp.fe1.p2;

/**
 *
 * @author falvojr
 */
public class Pedagio {

    private final static double TAXA = 2.5;
    private static int numeroCaminhoes;
    
    public static double calcularTaxa(Veiculo veiculo) {
        double retorno = 0;

        if (veiculo instanceof Caminhao) {
            Pedagio.numeroCaminhoes++;
//          Caminhao caminhao = (Caminhao) veiculo;
//          caminhao.getNumeroEixos();
            retorno = Pedagio.TAXA * ((Caminhao) veiculo).getNumeroEixos();
        } else {
            retorno = Pedagio.TAXA;
        }

        return retorno;
    }
    
    public static int getNumeroCaminhoes() {
        return Pedagio.numeroCaminhoes;
    }
}
