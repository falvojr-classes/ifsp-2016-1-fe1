package br.edu.ifsp.fe1.licao02;

/**
 * 2. Faça um teste criando dois objetos da classe Cliente.
 *
 * @author falvojr
 */
class MainExercicio02 {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        cliente1.codigo = 1;
        cliente1.nome = "Venilton FalvoJr";
        
        cliente2.codigo = 2;
        cliente2.nome = "Valdeco";
        
        String saida = String.format("Codigo %d = %s", cliente1.codigo, cliente1.nome);
   
        System.out.println(saida);
        System.out.println(String.format("Codigo %d = %s", cliente2.codigo, cliente2.nome));
    }
    
}
