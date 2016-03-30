package br.edu.ifsp.fe1.licao02;

/**
 * 14. Teste o relacionamento entre contas e agências.
 *
 * @author falvojr
 */
class MainExercicio14 {

    public static void main(String[] args) {

        // Cria e configura uma Agencia
        Agencia agencia = new Agencia(1);

        // Cria passando uma referência do tipo Agencia e configura os atributos
        // restantes para uma Conta
        Conta conta = new Conta(agencia);
        conta.numero = 14;
        conta.saldo = 2000;

        System.out.println(conta.agencia.numero);
        System.out.println(conta.numero);
        System.out.println(conta.limite);
        System.out.println(conta.saldo);
    }

}
