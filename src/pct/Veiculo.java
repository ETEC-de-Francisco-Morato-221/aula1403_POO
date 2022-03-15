/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author B1-08
 */
public class Veiculo {
    //Atributos
    String marca;
    String modelo;
    char cor; // Y - Yellow; B - Black; S - Silver.
    int velocidade;
    
    //Métodos
    public void exibirVeiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade);
    }
    
    public void acelerar(){
        if(velocidade < 120)
            velocidade++;
    }
    
}
