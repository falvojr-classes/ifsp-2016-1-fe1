package br.edu.ifsp.fe1.licao06;

/**
 *
 * @author falvojr
 */
public class MainExercicio15 {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal preguica = new Preguica();
        
        // Testes exercicio 15:
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
        System.out.println();
        
        // Testes exercicio 16:
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
        System.out.println();
        
        // Testes exercicio 17:
        Zoologico zoo = new Zoologico();
        
        Animal[] animais = new Animal[3];
        animais[0] = cachorro;
        animais[1] = cavalo;
        animais[2] = preguica;
        
        cachorro.setNome("Bob");
        cavalo.setNome("Pé de pano");
        
        zoo.setJaulas(animais);
        zoo.realizarPasseio();
    }

}
