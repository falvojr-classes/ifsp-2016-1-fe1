package br.edu.ifsp.fe1.licao02;

/**
 * 8. Faça um teste criando dois objetos da classe Conta. Altere e imprima os
 * atributos desses objetos.
 *
 * 9. Faça um teste que imprima os atributos de um objeto da classe Conta logo
 * após a sua criação.
 *
 * @author falvojr
 */
class MainConta {

    public static void main(String[] args) {
        Conta cliente1 = new Conta();
        Conta cliente2 = new Conta();

        // Exercicio 9:
        System.out.println(cliente1.numero);
        System.out.println(cliente1.limite);
        System.out.println(cliente1.saldo);
        
        // Exercicio 8:
        cliente1.numero = 1;
        cliente1.limite = 1000;
        cliente1.saldo = 1000;

        cliente2.numero = 2;
        cliente2.limite = 800;
        cliente2.saldo = 50;

        String saidaCliente1 = String.format("%d\n%.1f\n%.1f", cliente1.numero, cliente1.limite, cliente1.saldo);
        System.out.println(saidaCliente1);

        System.out.println(cliente2.numero);
        System.out.println(cliente2.limite);
        System.out.println(cliente2.saldo);
    }

}
