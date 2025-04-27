package com.mycompany.projesli;
// A capa terá: cor, material e preço (da capa).
public class Capa {
    
    public String CorCapa;
    public String MarcaCapa;
    public double PrecoCapa;
    
    public void Capa (String Cor, String Marca, double Preco){
        this. CorCapa = Cor;
        this.MarcaCapa = Marca;   
        this.PrecoCapa = Preco;
    }//Construtor da capa
    
    public void setCorCapa (String CorCapa){
        this.CorCapa = CorCapa;
    }
    public String getCorCapa (){
        return CorCapa;
    }
    public void setMarcaCapa (String MarcaCapa){
        this.MarcaCapa = MarcaCapa;
    }
    public String getMarcaCapa (){
        return MarcaCapa;
    }
    public void setPrecoCapa (double PrecoCapa){
        this.PrecoCapa = PrecoCapa;
    }
    public double getPrecoCapa (){
        return PrecoCapa;
    }
    
    public double Calculo (Celular c){ //Chama a classe e o objeto criado lá na main
        return PrecoCapa + c.Valor;
    } //Calculo da capa chamando o valor da Classe celular
}
