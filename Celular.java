package com.mycompany.projesli;
/*  O celular vai ser composto de: marca, cor, modelo, valor (do celular) e capa.   */
public class Celular {
    public String Marca;
    public String Cor;
    public String Modelo;
    public double Valor;
    
    public void Celular (){
        
    }//Construtor de celular
    public void setMarca (String Marca){
        this.Marca = Marca;
    }
    public String getMarca (){
        return Marca;
    }
    public void setCor (String Cor){
        this.Cor = Cor;
    }
    public String getCor (){
        return Cor;
    }
    public void setModelo (String Modelo){
        this.Modelo = Modelo;
    }
    public String getModelo (){
        return Modelo;
    }
    public void setValor (double Valor){
        this.Valor = Valor;
    }
    public double getValor (){
        return Valor;
    }
    
    
    
}

