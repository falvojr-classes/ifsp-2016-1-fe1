package br.edu.ifsp.fe1.licao04;

/**
 *
 * @author falvojr
 */
class MainExercicio15 {
    public static void main(String[] args) {
        // Criando Clube
        Clube clube = new Clube();
        clube.setNome("Ferroviaria");
        clube.setSaldo(500);
        
        //Criando Jogadores do Clube
        Jogador jogador12 = new Jogador(clube);
        jogador12.setNome("Juca");
        jogador12.setNumero(12);
        jogador12.setSalario(100);
        
        Jogador jogador3 = new Jogador(clube);
        jogador3.setNome("Pedro");
        jogador3.setNumero(3);
        jogador3.setSalario(125);
        
        Jogador jogador5 = new Jogador(clube);
        jogador5.setNome("Afonso");
        jogador5.setNumero(5);
        jogador5.setSalario(200);
        
        Jogador jogador8 = new Jogador(clube);
        jogador8.setNome("Kaka");
        jogador8.setNumero(8);
        jogador8.setSalario(250);
        
        Jogador jogador10 = new Jogador(clube);
        jogador10.setNome("Andre");
        jogador10.setNumero(10);
        jogador10.setSalario(200);
        
        // Pagando jogadores:      
        jogador3.recebeSalario();
        jogador5.recebeSalario();
        jogador8.recebeSalario();
        jogador10.recebeSalario();
        jogador12.recebeSalario();
        
        //Imprimindo informacoes:
        System.out.printf("Saldo %s: %.2f\n\n", clube.getNome(), clube.getSaldo());
        System.out.printf("Felicidade %s: %s\n", jogador3.getNome(), jogador3.isFelicidade());
        System.out.printf("Felicidade %s: %s\n", jogador5.getNome(), jogador5.isFelicidade());
        System.out.printf("Felicidade %s: %s\n", jogador8.getNome(), jogador8.isFelicidade());
        System.out.printf("Felicidade %s: %s\n", jogador10.getNome(), jogador10.isFelicidade());
        System.out.printf("Felicidade %s: %s\n", jogador12.getNome(), jogador12.isFelicidade());
    }
}
