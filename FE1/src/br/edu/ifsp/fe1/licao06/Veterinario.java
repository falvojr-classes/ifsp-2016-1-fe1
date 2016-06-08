package br.edu.ifsp.fe1.licao06;

/**
 *
 * @author falvojr
 */
public class Veterinario {
    
    public void examinar(Animal animal) {
        System.out.print("Examinando: ");
        animal.emitirSom();
    }
}
