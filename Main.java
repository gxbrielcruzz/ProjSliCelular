package com.mycompany.projesli;
// marca, cor, modelo, valor (do celular) e capa.   
public class Main {

    public static void main(String[] args) {
        Celular a = new Celular();//Novo Objeto Celular
        Capa b = new Capa ();// Objeto novo Capa e chama o metodo de calculo
        
        //Chamando metodo set pelo novo objeto Celular
        a.setMarca("Apple");
        a.setCor("Azul");
        a.setModelo("Iphone 67");
        a.setValor(3988.98);

        //Chama o metodo set pelo novo Obj Capa
        b.setCorCapa("Branca");
        b.setMarcaCapa("Ip 67");
        b.setPrecoCapa(40);
        
        System.out.println("O valor total do celular "+a.getMarca()+ " com a capa " + b.getCorCapa() + " d(e) " + b.getMarcaCapa()+" ficou de: " + b.Calculo(a));
        
    }
}
