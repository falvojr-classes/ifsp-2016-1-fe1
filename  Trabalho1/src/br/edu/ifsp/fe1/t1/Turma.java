package br.edu.ifsp.fe1.t1;

/**
 * 6. Em uma escola, os alunos precisam ser divididos por turmas, que devem ser
 * representadas dentro da aplicação. Implemente uma classe chamada Turma que
 * contenha quatro atributos: o primeiro para o período, o segundo para definir
 * a série, o terceiro para sigla e o quarto para o tipo de ensino.
 *
 * 14.b. Toda Turma pode ser criado com todos ou nenhum de seus atributos;
 *
 * @author falvojr
 */
class Turma {

    String periodo;
    String serie;
    String sigla;
    String tipoEnsino;

    Turma(String periodo, String serie, String sigla, String tipoEnsino) {
        this.periodo = periodo;
        this.serie = serie;
        this.sigla = sigla;
        this.tipoEnsino = tipoEnsino;
    }

    Turma() {
    }

}
