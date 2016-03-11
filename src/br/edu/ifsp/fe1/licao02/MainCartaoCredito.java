package br.edu.ifsp.fe1.licao02;

/**
 * 4. Faça um teste criando dois objetos da classe CartaoDeCredito. Altere e
 * imprima os atributos desses objetos.
 *
 * @author falvojr
 */
public class MainCartaoCredito {

    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito();
        CartaoCredito cartao2 = new CartaoCredito();

        cartao1.numero = 9999999999999999L;
        cartao1.dataExpiracao = "10/02/2016";

        cartao2.numero = 2;
        cartao2.dataExpiracao = "10/02/2016";

        System.out.println(cartao1.numero);
        System.out.println(cartao1.dataExpiracao);
        System.out.println(cartao2.numero);
        System.out.println(cartao2.dataExpiracao);
    }

}
