package br.edu.ifsp.fe1.licao01;

/**
 * 7. Faça um programa na linguagem C que receba o custo de um espetáculo
 * teatral e o preço do convite desse espetáculo. Esse programa deve calcular e
 * mostrar a quantidade de convites que devem ser vendidos para que pelo menos o
 * custo do espetáculo seja alcançado.
 *
 * @author falvojr
 */
public class Exercicio05 {

    /**
     * Método main.
     *
     * @param args argumentos necessários: Valor do Espetáculo e Preco do Convite.
     */
    public static void main(String[] args) {
        float valorEspetaculo, precoConvite;
        double qtdConvitesNecessaria;

        valorEspetaculo = Float.parseFloat(args[0]);
        precoConvite = Float.parseFloat(args[1]);

        qtdConvitesNecessaria = Math.ceil(valorEspetaculo / precoConvite);

        String saida = String.format("Quantidade de convites: %.0f", qtdConvitesNecessaria);
        System.out.println(saida);
    }

}
