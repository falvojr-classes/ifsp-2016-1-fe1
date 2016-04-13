package br.edu.ifsp.fe1.licao03;

/**
 * 7. Crie uma classe chamada Cliente que também utilize um atributo estático
 * para a geração de códigos únicos para suas instâncias. Nesse sentido, essa
 * classe deve possuir os atributos de instância codigo e nome. Além disso, crie
 * um construtor sem parâmetros e outro que receba o nome do Cliente como
 * parâmetro.
 *
 * @author falvojr
 */
class Cliente {

    static int contador;
    
    int codigo;
    String nome;

    Cliente() {
        this.codigo = ++Cliente.contador;
    }
    
    Cliente(String nome) {
        this();
        this.nome = nome;
    }
}
