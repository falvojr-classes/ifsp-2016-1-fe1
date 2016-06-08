package br.edu.ifsp.fe1.licao06;

/**
 *
 * @author falvojr
 */
public abstract class AnimalEscalador extends Animal {

    public void subir() {
        String quebra = System.lineSeparator();
        System.out.printf("%s está escalando!%s", super.getNome(), quebra);
    }
}
