package br.edu.ifsp.fe1;

import br.edu.ifsp.fe1.entidades.Clube;
import br.edu.ifsp.fe1.entidades.Jogador;
import br.edu.ifsp.fe1.entidades.PreparadorFisico;
import br.edu.ifsp.fe1.entidades.Tecnico;

/**
 * Classe de testes.
 * 
 * @author falvojr
 */
public class MainExercicio11 {
    public static void main(String[] args) {
        Clube clube = new Clube();
        clube.setNome("IFSP");
        clube.setSaldo(1000);
        
        Tecnico tecnico = new Tecnico(600, clube);
        Jogador jogador1 = new Jogador(200, clube);
        Jogador jogador2 = new Jogador(300, clube);
        Jogador jogador3 = new Jogador(100, clube);
        Jogador jogador4 = new Jogador(50, clube);
        Jogador jogador5 = new Jogador(500, clube);
        PreparadorFisico preparador = new PreparadorFisico(39.5, clube);
        preparador.setEspecialidade(PreparadorFisico.RESISTENCIA);
        
        tecnico.receberSalario();
        jogador1.receberSalario();
        jogador2.receberSalario();
        jogador3.receberSalario();
        jogador4.receberSalario();
        jogador5.receberSalario();
        preparador.receberSalario();
        
        System.out.println(tecnico.isFeliz());
        System.out.println(jogador1.isFeliz());
        System.out.println(jogador2.isFeliz());
        System.out.println(jogador3.isFeliz());
        System.out.println(jogador4.isFeliz());
        System.out.println(jogador5.isFeliz());
        System.out.println(preparador.isFeliz());
        System.out.println(clube.getSaldo());
    }
}
