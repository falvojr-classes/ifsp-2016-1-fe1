package br.edu.ifsp.fe1.t1;

/**
 * 13. Em uma nova classe de testes crie 2 Turmas, 5 Alunos e relacione-os de
 * modo que a primeira Turma possua 2 Alunos e a segunda os 3 restantes.
 *
 * @author falvojr
 */
class MainExercicio13 {
    
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        
        Aluno aluno1 = new Aluno("25/11/1991");
        Aluno aluno2 = new Aluno("25/11/1992");
        Aluno aluno3 = new Aluno("25/11/1993");
        Aluno aluno4 = new Aluno("25/11/1994");
        Aluno aluno5 = new Aluno("25/11/1995");
        
        aluno1.turma = turma1;
        aluno2.turma = turma1;
        aluno3.turma = turma2;
        aluno4.turma = turma2;
        aluno5.turma = turma2;
        
    }
    
}
