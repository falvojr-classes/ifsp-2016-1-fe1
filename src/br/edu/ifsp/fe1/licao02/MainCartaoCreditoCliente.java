package br.edu.ifsp.fe1.licao02;

/**
 * 12. Teste o relacionamento entre clientes e cartões de crédito.
 *
 * @author falvojr
 */
class MainCartaoCreditoCliente {

    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito();

        cartao1.numero = 9999999999999999L;
        cartao1.dataExpiracao = "10/02/2016";

        // Antes de acessar um atributo de um objeto, esse objeto deve ser criado!
        cartao1.cliente = new Cliente();
        cartao1.cliente.codigo = 1;
        cartao1.cliente.nome = "Venilton FalvoJr";

        System.out.println(cartao1.cliente.codigo);
        System.out.println(cartao1.cliente.nome);
    }

}
