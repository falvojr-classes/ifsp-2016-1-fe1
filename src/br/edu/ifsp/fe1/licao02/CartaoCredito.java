package br.edu.ifsp.fe1.licao02;

/**
 * 3. Os bancos oferecem aos clientes a possibilidade de obter um cartão de
 * crédito que pode ser utilizados para fazer compras. Um cartão de crédito
 * possui um número e uma data de validade. Crie uma classe para modelar os
 * objetos que representarão os cartões de crédito.
 *
 * @author falvojr
 */
class CartaoCredito {

    long numero;
    String dataExpiracao;

    /**
     * 11. Defina um vínculo entre os objetos que representam os clientes e os
     * objetos que representam os cartões de crédito. Para isso, você deve
     * alterar a classe CartaoCredito.
     */
    Cliente cliente;

    /**
     * 23. Acrescente um construtor na classe CartaoCredito que receba um número
     * como parâmetro.
     *
     * @param numero valor que será atribuído ao atributo numero do
     * CartaoCredito.
     */
    CartaoCredito(long numero) {
        this.numero = numero;
    }

    CartaoCredito() {
    }
}
