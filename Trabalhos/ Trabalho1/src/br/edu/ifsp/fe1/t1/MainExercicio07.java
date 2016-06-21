package br.edu.ifsp.fe1.t1;

/**
 * 7. Faça uma classe chamada MainExercicio07 para criar dois objetos da classe
 * Turma . Adicione informações a eles e depois mostre essas informações na
 * tela.
 *
 * @author falvojr
 */
class MainExercicio07 {
    
    public static void main(String[] args) {
        Turma turma1 = new Turma("M", "1", "T1", "Tecnico");
        Turma turma2 = new Turma();
        
        turma2.periodo = "N";
        turma2.serie = "2";
        turma2.sigla = "T2";
        turma2.tipoEnsino = "Tecnico";
        
        System.out.println(turma1.sigla + "\n" + turma1.tipoEnsino);
        System.out.printf("%s\n%s", turma2.sigla, turma2.tipoEnsino);
    }
}
