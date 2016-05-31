package br.edu.ifsp.fe1.licao06;

/**
 * 5. Faça um teste para o gerador de extratos.
 *
 * @author falvojr
 */
public class MainExercicio05 {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        cc.setSaldo(500.25);
        cp.setSaldo(125.00);

        GeradorExtratos.imprimirExtratoBasico(cc);
        GeradorExtratos.imprimirExtratoBasico(cp);
    }
}
