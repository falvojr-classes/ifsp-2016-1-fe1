package br.edu.ifsp.fe1.licao02;

/**
 * 2. Faça um teste criando dois objetos da classe Cliente.
 *
 * @author falvojr
 */
public class MainCliente {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        cliente1.codigo = 1;
        cliente1.nome = "Venilton FalvoJr";
        
        cliente2.codigo = 2;
        cliente2.nome = "Valdeco";
        
        System.out.println(cliente1.codigo);
        System.out.println(cliente1.nome);
        System.out.println(cliente2.codigo);
        System.out.println(cliente2.nome);
    }
    
}
