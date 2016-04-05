package br.edu.ifsp.fe1.licao02;

/**
 * Suponha que Luís Carlos, cliente de um banco, solicite a seu gerente os
 * seguintes Cartões de Crédito para sua família (esposa e filho): <br>
 * 
 * a) 2 para o titular Luís Carlos (código 764) com expiração em 12/2018; <br>
 * b) 1 para o titular Maria do Carmo (código 764) com expiração em 12/2018; <br>
 * c) 1 para o titular Luís Carlos Júnior (código 825) com expiração em 12/2016.
 * 
 * @author falvojr
 */
class MainExercicio15 {

    public static void main(String[] args) {

        // Luis Carlos:
        Cliente clienteLuis = new Cliente();
        clienteLuis.codigo = 763;
        clienteLuis.nome = "Luis Carlos";

        CartaoCredito cartaoLuis1 = new CartaoCredito();
        cartaoLuis1.numero = 1;
        cartaoLuis1.dataExpiracao = "12/2018";

        CartaoCredito cartaoLuis2 = new CartaoCredito();
        cartaoLuis2.numero = 2;
        cartaoLuis2.dataExpiracao = "12/2018";

        cartaoLuis1.cliente = clienteLuis;
        cartaoLuis2.cliente = clienteLuis;

        // Maria do Carmo
        Cliente clienteMaria = new Cliente();
        clienteMaria.codigo = 764;
        clienteMaria.nome = "Maria do Carmo";

        CartaoCredito cartaoMaria = new CartaoCredito();
        cartaoMaria.numero = 3;
        cartaoMaria.dataExpiracao = "12/2018";

        cartaoMaria.cliente = clienteMaria;

        // Luis Carlos Junior
        Cliente clienteJunior = new Cliente();
        clienteJunior.codigo = 850;
        clienteJunior.nome = "Luis Carlos Junior";

        CartaoCredito cartaoJunior = new CartaoCredito();
        cartaoJunior.numero = 4;
        cartaoJunior.dataExpiracao = "12/2016";

        cartaoJunior.cliente = clienteJunior;
    }

}
