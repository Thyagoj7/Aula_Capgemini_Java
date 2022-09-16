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
public class Invoice {
    
    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);   
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }

    public double getInvoiceAmount(){
        return quantidade * precoUnitario; 
    } 
    
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0 ){
            this.quantidade=0;
        }else{
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario < 0){
            this.precoUnitario=0;
        }else{
            this.precoUnitario = precoUnitario;
        }
    }
}
