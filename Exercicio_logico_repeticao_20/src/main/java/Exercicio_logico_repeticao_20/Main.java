/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_logico_repeticao_20;

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
        // TODO code application logic here
                
        Scanner esc = new Scanner(System.in);
        
        float valor;
        int ano;
        float desconto=0;
        float valordesc;
        float valorFi;
        
        int totalCarros = 0;
        int totalcarrosSemin = 0;
        

        char calcular ='s';
        
        while(calcular=='s'){
            System.out.println("Digite o valor do carro");
            valor = esc.nextFloat();
            
            System.out.println("Digite o ano do carro");
            ano = esc.nextInt();
            
            if(ano <= 2000){
                desconto = 12;
            }else if(ano > 2000){
                desconto = 7;
                totalcarrosSemin ++;
            }
            
            totalCarros ++;
            valordesc = valor/100 * desconto;
            
            valorFi = valor - valordesc;
            
            System.out.println("O valor do carro ficará por " + valorFi);
            
            
            
            System.out.println("Deseja continar caluclando? ");
            
            calcular=esc.next().charAt(0);
            
        }
       
        System.out.println("Total de carros" + totalCarros);
        System.out.println("Total de carros Seminovos" + totalcarrosSemin);
    }
}