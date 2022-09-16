/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

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
        
        Pessoa ObjetoPessoa = new Pessoa(1.75f,150.0f);
        
        Scanner esc = new Scanner(System.in);
        
        System.out.println("Digite a altura");
        
        ObjetoPessoa.setAltura(esc.nextFloat());
        
        System.out.println("Digite o peso");
        
        ObjetoPessoa.setPeso(esc.nextFloat());
        
        //System.out.println("O resultado do calculo é " + ObjetoPessoa.calcularIMC());
        
        System.out.println("A altura é " + ObjetoPessoa.getAltura());
        
     
    }
    
}
