package br.edu.ifsp.fe1.t1;

/**
 * 3. Faça uma classe chamada MainExercicio03 e crie dois objetos da classe
 * Aluno atribuindo valores a eles. Essa classe também deve mostrar na tela as
 * informações desses objetos.
 *
 * @author falvojr
 */
class MainExercicio03 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("10/08/1992");
        Aluno aluno2 = new Aluno("25/11/1995");

        aluno1.nome = "Aluno 1";
        aluno1.rg = "99.999.9999-X";

        aluno2.nome = "Aluno 2";
        aluno2.rg = "88.888.888-1";

        System.out.printf("%s\n%s\n%s\n\n", aluno1.nome, aluno1.rg, aluno1.dataNascimento);
        System.out.printf("%s\n%s\n%s\n", aluno2.nome, aluno2.rg, aluno2.dataNascimento);
    }

}
