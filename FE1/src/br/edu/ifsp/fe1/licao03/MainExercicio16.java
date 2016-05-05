package br.edu.ifsp.fe1.licao03;

import br.edu.ifsp.fe1.util.Fe1Util;

/**
 * 16. Em uma nova classe de testes, crie uma pessoa, coloque seu nome e idade
 * inicial, faça alguns aniversários (aumentando a idade) e imprima seu nome e
 * sua idade.
 *
 * @author falvojr
 */
class MainExercicio16 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.nome = "Pessoa 1";
        pessoa2.nome = "Pessoa 2";
        
        int maxAniversarios = Fe1Util.geraAleatorio(1, 100);
        for (int i = 1; i <= maxAniversarios; i++) {
            if (i%2 == 0) {
                pessoa1.fazAniversario();
            } else {
                pessoa2.fazAniversario();
            }
        }
        
        System.out.printf("A idade de %s eh %d\n", pessoa1.nome, pessoa1.idade);
        System.out.printf("A idade de %s eh %d\n", pessoa2.nome, pessoa2.idade);
        System.out.println(Pessoa.qtdAniversarios);
    }
}
