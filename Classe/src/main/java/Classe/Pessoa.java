/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

public class Pessoa {
   //Atributos
    private float peso;
    private float altura;
    
    public Pessoa(float peso, float altura){
        
        this.altura=altura;
        this.peso=peso;
        
    
    }
    
    public float calcularIMC(){
        
        float imc=peso/(altura * altura );
        return imc;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
       
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura=altura;
    }
    
    public float getAltura(){
        return altura;
    }
}
