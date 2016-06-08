package br.edu.ifsp.fe1.licao06;

/**
 * 13. Crie uma nova classe clamada Cliente e, utilizando o conceito de Arrays
 * (análogo aos Vetores em C), crie um atributo que permita o armazenamento de
 * multiplas Contas. Além disso crie um método de instância que imprima o
 * extrato básico de cada uma de suas Contas.
 *
 * @author falvojr
 */
public class Cliente {

    private Conta[] contas;

    public Conta[] getContas() {
        return this.contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public void imprimirExtratosBasicos() {
        if (this.contas != null) {
            for (int i = 0; i < this.contas.length; i++) {
                Conta conta = this.contas[i];
                GeradorExtratos.imprimirExtratoBasico(conta);
            }
        }
    }
}
