package br.edu.ifsp.fe1.prova1;

/**
 *
 * @author falvojr
 */
public class Main {
    
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        Motor motor2 = new Motor();
        Motor motor3 = new Motor();
        
        Carro carro1 = new Carro(motor1);
        Carro carro2 = new Carro(motor2);
        Carro carro3 = new Carro(motor3);
        
        carro1.liga();
        carro2.liga();
        carro3.liga();
                
        carro1.acelera();
        carro2.acelera(50);
        carro3.acelera();
        
        System.out.println(carro1.motor.potencia);
        System.out.println(carro2.motor.potencia);
        System.out.println(carro3.motor.potencia);
    }
}
