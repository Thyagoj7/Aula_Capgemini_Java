/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_POO;


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
        Invoice devoice = new Invoice(1,"mouse",10,50.0f);
        
        System.out.println("Total da venda = " + devoice.getInvoiceAmount());
    }
    
    
}
