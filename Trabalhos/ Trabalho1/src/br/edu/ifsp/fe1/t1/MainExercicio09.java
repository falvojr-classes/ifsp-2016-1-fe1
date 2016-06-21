package br.edu.ifsp.fe1.t1;

/**
 * 9. Em uma nova classe teste o relacionamento entre os alunos e as turmas,
 * criando um objeto de cada classe e atribuindo valores a eles. Imprima os
 * valores que estão nos atributos da turma através do objeto da classe Aluno.
 *
 * @author falvojr
 */
class MainExercicio09 {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno("25/11/1995");
        
        aluno.nome = "Aluno com Turma";
        aluno.turma = new Turma();
        aluno.turma.sigla = "T1";
        
        System.out.println(aluno.turma.sigla);
    }
    
}
