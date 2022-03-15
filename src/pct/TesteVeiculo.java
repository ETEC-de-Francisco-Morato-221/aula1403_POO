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
public class TesteVeiculo {
    public static void main(String[] args) {
        //Criação do objeto da classe Veículo
        //Veiculo minhaCaranga;
        
        //Instância...
        //minhaCaranga = new Veiculo();
        
        //Criação e instância do objeto da classe Veículo
        Veiculo outraCaranga = new Veiculo();
        
        //Construir o objeto
        outraCaranga.marca = "Fiat";
        outraCaranga.modelo = "147";
        outraCaranga.cor = 'Y';
        outraCaranga.velocidade = 0;
        
        //Exibindo a minha caranga
        System.out.println("\n\t\t\t -- Outra Caranga --\n");
        outraCaranga.exibirVeiculo();
        
        //Acelerando a minha caranga
        for(int i = 0; i < 200; i++)
            outraCaranga.acelerar();
        
        //Exibindo a minha caranga ACELERADA
        System.out.println("\n\t\t\t -- Outra Caranga ACELERADA --\n");
        outraCaranga.exibirVeiculo();
        
        
        
        
        
        
        
        
        
    }
    
}
