package br.edu.ifsp.fe1.licao06;

/**
 *
 * @author falvojr
 */
public abstract class AnimalCorredor extends Animal {

    public void correr() {
        String quebra = System.lineSeparator();
        System.out.printf("%s está correndo!%s", super.getNome(), quebra);
    }
}
