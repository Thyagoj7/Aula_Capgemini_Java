/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_estrutura_repeticao;

import java.util.Scanner;

/**
 *
 * @author ty_jo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        char desejaContinuar='s';
        
        //desejaContinuar = ler.nextLine();
        System.out.println("Digite um número");
        while(desejaContinuar == 'S' || desejaContinuar =='s'){
            
            int numero = ler.nextInt();
            
            if(numero > 0){
                System.out.println("O numero é positivo");
            }else if(numero < 0 ){
                System.out.println("O numero é negativo");
            }else{
                System.out.println("O numero é zero");
            }
            
            System.out.println("S para contniar N para parar");
            desejaContinuar = ler.next().charAt(0);
            
            
        }
    }
    
}
