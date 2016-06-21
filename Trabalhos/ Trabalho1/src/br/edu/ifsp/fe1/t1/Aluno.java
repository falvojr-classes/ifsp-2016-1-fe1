package br.edu.ifsp.fe1.t1;

/**
 * 2. Implemente uma classe chamada Aluno para definir os objetos que
 * representarão os alunos de uma escola. Essa classe deve declarar três
 * atributos: o primeiro para o nome, o segundo para o RG e o terceiro para a
 * data de nascimento dos alunos.
 *
 * @author falvojr
 */
class Aluno {

    String nome;
    String rg;
    String dataNascimento;
    /**
     * 8. Defina um relacionamento entre os alunos e as turmas, criando na
     * classe Aluno um atributo do tipo Turma .
     */
    Turma turma;

    /**
     * 14.a. Todo Aluno deve ser criado com sua respectiva data de nascimento;
     *
     * @param dataNascimento
     */
    Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
