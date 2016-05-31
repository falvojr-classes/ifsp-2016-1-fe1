package br.edu.ifsp.fe1.licao06;

/**
 * 3. Defina duas classes específicas para dois tipos de contas do banco:
 * poupança (com o atributo de classe rendimentoMensal) e corrente (como o
 * atributo de instância limite).
 *
 * @author falvojr
 */
public class ContaCorrente extends Conta {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
