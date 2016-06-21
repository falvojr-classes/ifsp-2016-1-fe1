package br.edu.ifsp.fe1.p2;

/**
 *
 * @author falvojr
 */
public class Main {

    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        moto.setValor(1000);
        moto.setAno(1999);
        
        carro.setValor(10000);
        carro.setAno(2006);
        
        caminhao.setValor(100000);
        caminhao.setNumeroEixos(10);
        caminhao.setAno(1989);
        
        System.out.println("IPVA's:");
        double ipvaMoto = moto.calcularIPVA();
        System.out.println(ipvaMoto);
        double ipvaCarro = carro.calcularIPVA();
        System.out.println(ipvaCarro);
        double ipvaCaminhao = caminhao.calcularIPVA();
        System.out.println(ipvaCaminhao);
        
        System.out.println();
        System.out.println("Taxas de Pedagio:");
        double taxaMoto = Pedagio.calcularTaxa(moto);
        System.out.println(taxaMoto);
        double taxaCarro = Pedagio.calcularTaxa(carro);
        System.out.println(taxaCarro);
        double taxaCaminhao = Pedagio.calcularTaxa(caminhao);
        System.out.println(taxaCaminhao);
        
        System.out.println();
        System.out.println("Numero de Caminhoes:");
        int caminhoes = Pedagio.getNumeroCaminhoes();
        System.out.println(caminhoes);
    }
}
