package br.edu.ifsp.fe1.licao03;

/**
 * 1. Crie uma classe chamada Conta no pacote br.edu.ifsp.fe1.licao03. Defina um
 * atributo de classe para contabilizar o número de objetos instanciados a
 * partir da classe Conta. Esse atributo deve ser incrementado toda vez que um
 * objeto é criado. Você pode utilizar construtores para fazer o incremento.
 *
 * @author falvojr
 */
class Conta {

    static int contador;
    int numero;

    /**
     * 3. O contador de contas pode ser utilizado para gerar um número único
     * para cada conta. Acrescente na classe Conta um atributo de instância para
     * guardar o número das contas. Implemente no construtor a lógica para gerar
     * esses números de forma única através do contador de contas.
     *
     */
    Conta() {
        this.numero = 90000 + Conta.contador++;
    }

    /**
     * 5. Adicione um método de classe na classe Conta para zerar o contador e
     * imprimir o total de contas anterior.
     */
    static void zeraContador() {
        int contasCriadas = Conta.contador;
        System.out.printf("Contas criadas antes de zerar: %d", contasCriadas);
        Conta.contador = 0;
    }
}
