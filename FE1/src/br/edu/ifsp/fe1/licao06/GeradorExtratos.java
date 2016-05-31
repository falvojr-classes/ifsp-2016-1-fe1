/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.fe1.licao06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 4. Defina uma classe para especificar um gerador de extratos com um método
 * chamado imprimirExtratoBasico que receba uma conta de qualquer tipo como
 * parâmetro. Esse método deve imprimir a data atual no formato “dd/MM/yyyy
 * HH:mm:ss” e o saldo da conta passada como parâmetro.
 *
 * @author falvojr
 */
public class GeradorExtratos {

    public static void imprimirExtratoBasico(Conta conta) {
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataAtual = new Date();
        String dataAtualFormatada = formatadorData.format(dataAtual);
        
        String saidaImpressao = String.format("Saldo: %.2f no dia %s", conta.getSaldo(), dataAtualFormatada);
        System.out.println(saidaImpressao);
        if (conta instanceof ContaCorrente) {
            // Opcao 1:
            double limite = ((ContaCorrente) conta).getLimite();
            // Opcao 2:
            // ContaCorrente cc = (ContaCorrente) conta;
            // limite = cc.getLimite();
            System.out.println("Limite: " + limite);
        }
    }
    
}
