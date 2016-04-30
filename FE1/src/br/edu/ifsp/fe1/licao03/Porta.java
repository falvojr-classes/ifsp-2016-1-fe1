package br.edu.ifsp.fe1.licao03;

/**
 * 18. Crie uma classe chamada Porta, seguindo as seguintes especificações:
 * Atributos de instância: 
 *  aberta, 
 *  cor, 
 *  dimensaoX, 
 *  dimensaoY, 
 *  dimensaoZ; 
 * Métodos de instância: 
 *  void abre() 
 *  void fecha() 
 *  void pinta(String s) 
 *  boolean estaAberta()
 *
 * @author falvojr
 */
class Porta {
    /**
     * Inicia por padrao como <b>false</b>.
     */
    private boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    void abre() {
        this.aberta = true;
    }
    
    void fecha() {
        this.aberta = false;
    }
    
    void pinta(String cor) {
        this.cor = cor;
    }
    
    boolean estaAberta() {
        return this.aberta;
    }  
    /**
     * Opcional...
     */
    void imprimeEstado() {
        if (this.aberta) {
            System.out.println("Porta Aberta!");
        } else {
            System.out.println("Porta Fechada!");
        }
    }
}
