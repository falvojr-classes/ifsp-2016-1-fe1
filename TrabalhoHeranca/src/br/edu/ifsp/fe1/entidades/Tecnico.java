package br.edu.ifsp.fe1.entidades;

/**
 * Sub classe que representa o funcionario do tipo Tecnico.
 * 
 * @author falvojr
 */
public class Tecnico extends Funcionario {
  
    private static int contador;
    
    public Tecnico(double salario, Clube clube) {
        super(salario, clube);
        Tecnico.contador++;
    }
  
    public static int getContador() {
        return Tecnico.contador;
    }
}
