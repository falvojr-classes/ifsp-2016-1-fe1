package br.edu.ifsp.fe1.licao06;

/**
 * 3. Defina duas classes específicas para dois tipos de contas do banco:
 * poupança (com o atributo de classe rendimentoMensal) e corrente (como o
 * atributo de instância limite).
 *
 * @author falvojr
 */
public class ContaPoupanca extends Conta {

    private static double redimentoMensal;

    public static double getRedimentoMensal() {
        return ContaPoupanca.redimentoMensal;
    }

    public static void setRedimentoMensal(double redimentoMensal) {
        ContaPoupanca.redimentoMensal = redimentoMensal;
    }

}
