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
class MainExercicio08e09 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        // Exercicio 9:
        System.out.println(conta1.numero);
        System.out.println(conta1.limite);
        System.out.println(conta1.saldo);
        
        // Exercicio 8:
        conta1.numero = 1;
        conta1.limite = 1000;
        conta1.saldo = 1000;

        conta2.numero = 2;
        conta2.limite = 800;
        conta2.saldo = 50;

        String saidaCliente1 = String.format("%d\n%.1f\n%.1f", conta1.numero, conta1.limite, conta1.saldo);
        System.out.println(saidaCliente1);

        System.out.println(conta2.numero);
        System.out.println(conta2.limite);
        System.out.println(conta2.saldo);
    }

}
