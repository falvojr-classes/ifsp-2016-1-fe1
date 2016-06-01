package br.edu.ifsp.fe1.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 9. Com o objetivo de expor métodos úteis que serão utilizados no decorrer da
 * disciplina, crie uma nova classe chamada Fe1Util no pacote
 * br.edu.ifsp.fe1.util, também novo. Com isso, refatore o exercicio anterior
 * para que o método geraAleatorio() seja acessado a partir da classe Fe1Util.
 *
 * @author falvojr
 */
public class Fe1Util {

    public static int geraAleatorio(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    public static void dormir(long tempoMilisegundos) {
        try {
            Thread.sleep(tempoMilisegundos);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
