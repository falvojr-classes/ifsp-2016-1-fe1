package br.edu.ifsp.fe1.licao03;

/**
 * 19. Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere
 * suas dimensões e use o método estaAberta para verificar se ela está aberta.
 *
 * @author falvojr
 */
class MainExercicio19 {
    public static void main(String[] args) {
        Porta porta = new Porta();
        
        porta.abre();
        porta.fecha();
        
        porta.pinta("Azul");
        porta.pinta("Verde");
        porta.pinta("Branco");
        
        porta.dimensaoX = 30.5;
        porta.dimensaoY = 180.0;
        porta.dimensaoZ = 10.25;
        
        if (porta.estaAberta()) {
            System.out.println("Porta Aberta!");
        } else {
            System.out.println("Porta Fechada!");
        }
        
    }
}
