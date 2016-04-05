package br.edu.ifsp.fe1.licao01;

/**
 * 2. Faça um programa onde o usuário possa entrar com o seu primeiro nome,
 * posteriormente com o sobrenome. Ao final o programa deve imprimir o nome
 * completo do usuário.
 *
 * @author falvojr
 */
public class Exercicio02 {

    /**
     * Método main.
     *
     * @param args argumentos necessários: Nome e Sobrenome.
     */    
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        
        String saida = String.format("%s %s", nome, sobrenome);
        System.out.println(saida);
    }
    
}
