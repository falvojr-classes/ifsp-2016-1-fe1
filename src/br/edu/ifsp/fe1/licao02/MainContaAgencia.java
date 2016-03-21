package br.edu.ifsp.fe1.licao02;

/**
 * 15. Teste o relacionamento entre contas e agências.
 *
 * @author falvojr
 */
class MainContaAgencia {

    public static void main(String[] args) {

        // Cria e configura uma Conta
        Conta conta = new Conta();
        conta.numero = 1;
        conta.saldo = 1000;

        // Cria e configura uma Agencia
        Agencia agencia = new Agencia();
        agencia.numero = 1;

        // Relaciona Conta com Agencia
        conta.agencia = agencia;

        System.out.println(conta.agencia.numero);
        System.out.println(conta.numero);
        System.out.println(conta.limite);
        System.out.println(conta.saldo);
    }

}
