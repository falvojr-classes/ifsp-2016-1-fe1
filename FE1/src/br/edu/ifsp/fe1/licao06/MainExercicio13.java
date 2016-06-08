package br.edu.ifsp.fe1.licao06;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de testes para o exercício 13.
 *
 * @author falvojr
 */
public class MainExercicio13 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        ContaCorrente cc2 = new ContaCorrente();

        cc.setSaldo(100);
        cp.setSaldo(5000);
        cc2.setSaldo(20);

        ((ContaCorrente) cc).setLimite(600);
        cc2.setLimite(500);

        Conta[] contas = new Conta[3];
        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cc2;

        cliente.setContas(contas);
        cliente.imprimirExtratosBasicos();
    }
}
