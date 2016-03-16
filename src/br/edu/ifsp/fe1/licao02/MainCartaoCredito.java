package br.edu.ifsp.fe1.licao02;

/**
 * 4. Faça um teste criando dois objetos da classe CartaoCredito. Altere e
 * imprima os atributos desses objetos.
 *
 * @author falvojr
 */
class MainCartaoCredito {

    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito();
        CartaoCredito cartao2 = new CartaoCredito();

        cartao1.numero = 9999999999999999L;
        cartao1.dataExpiracao = "10/02/2016";

        cartao2.numero = 9999999999999999L;
        cartao2.dataExpiracao = "10/02/2016";

        if (cartao1.equals(cartao2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        
        System.out.println(cartao1);
        System.out.println(cartao2);
    }

}
