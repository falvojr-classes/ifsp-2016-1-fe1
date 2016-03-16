package br.edu.ifsp.fe1.licao02;

/**
 * 6. Faça um teste criando dois objetos da classe Agencia. Altere e imprima os
 * atributos desses objetos.
 *
 * @author falvojr
 */
class MainAgencia {

    public static void main(String[] args) {
        Agencia cliente1 = new Agencia();
        Agencia cliente2 = new Agencia();

        cliente1.numero = 1;

        cliente2.numero = 2;

        System.out.println(cliente1.numero);
        System.out.println(cliente2.numero);
    }

}
