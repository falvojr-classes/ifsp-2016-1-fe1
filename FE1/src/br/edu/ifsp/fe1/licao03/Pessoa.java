package br.edu.ifsp.fe1.licao03;

/**
 * 15. Crie uma classe chamada Pessoa e defina dois atributos de instância (nome
 * e idade) e um método de instância chamado fazAniversario, que deve aumentar
 * em 1 a idade de um objeto do tipo Pessoa.
 *
 * @author falvojr
 */
class Pessoa {

    String nome;
    int idade;
    
    static int qtdAniversarios;

    void fazAniversario() {
        this.idade++;
        //this.idade += 1;
        //this.idade = this.idade + 1;
        Pessoa.qtdAniversarios++;
    }
}
