package br.edu.ifsp.fe1.licao02;

/**
 * 12. Teste o relacionamento entre clientes e cartões de crédito.
 *
 * @author falvojr
 */
class MainExercicio12 {

    public static void main(String[] args) {
        
        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.numero = 9999999999999999L;
        cartaoCredito.dataExpiracao = "10/02/2016";

        // Antes de acessar um atributo de um objeto, esse objeto deve ser criado!
        cartaoCredito.cliente = new Cliente();
        cartaoCredito.cliente.codigo = 1;
        cartaoCredito.cliente.nome = "Venilton FalvoJr";

        System.out.println(cartaoCredito.cliente.codigo);
        System.out.println(cartaoCredito.cliente.nome);
    }

}
