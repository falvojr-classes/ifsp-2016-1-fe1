package br.edu.ifsp.fe1.licao03;

/**
 * 15. Crie uma classe chamada Pessoa e defina dois atributos de instância (nome
 * e idade) e um método de instância chamado fazAniversario, que deve aumentar
 * em 1 a idade de um objeto do tipo Pessoa.
 *
 * 17. Modifique a classe Pessoa para que seja possível identificar quantos
 * aniversários foram comemorados considerando todas as instâncias dessa classe.
 * Para isso, utilize um atributo de classe chamado qtdAniversarios.
 *
 * @author falvojr
 */
class Pessoa {

    String nome;
    int idade;

    static int qtdAniversarios;

    void fazAniversario() {
        this.idade++;
        Pessoa.qtdAniversarios++;
    }
}
