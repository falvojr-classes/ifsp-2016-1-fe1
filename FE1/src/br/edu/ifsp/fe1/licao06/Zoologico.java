package br.edu.ifsp.fe1.licao06;

/**
 *
 * @author falvojr
 */
public class Zoologico {
    
    private Animal[] jaulas;

    public Animal[] getJaulas() {
        return jaulas;
    }

    public void setJaulas(Animal[] jaulas) {
        this.jaulas = jaulas;
    }
    
    public void realizarPasseio() {
        if (this.jaulas != null) {
            for (int i = 0; i < this.jaulas.length; i++) {
                Animal animal = this.jaulas[i];
                animal.emitirSom();
                if (animal instanceof AnimalCorredor) {
                    ((AnimalCorredor) animal).correr();
                }
            }
        }
    }
}
