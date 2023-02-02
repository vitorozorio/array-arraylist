package br.loiane.vetor;
import br.loiane.vetor.Pessoa.Pessoa;

import java.util.ArrayList;


public class Teste_Vetor {
    public static void main(String[] args)  {

        Pessoa p1 = new Pessoa("vitor","1234");
        Pessoa p2 = new Pessoa("igor","4567");
        Pessoa p3 = new Pessoa("larissa","5555");
        Pessoa p4 = new Pessoa("queila","4444");
        Pessoa p5 = new Pessoa("mellyssa","8888");

        ArrayList<Pessoa> arraypessoa = new ArrayList<Pessoa>(); // instanciando a class arraylist

        arraypessoa.add(p1); // metodo adiciona
        arraypessoa.add(p2);


        System.out.println(arraypessoa);

        arraypessoa.add(1,p3); // metodo adiciona em uma posição

        System.out.println(arraypessoa);

         boolean existe = arraypessoa.contains(p4);

         if (existe) {

             System.out.println("\no elemento : "+ p4 +" esta listado no vetor ");
         } else {

             System.out.println("\no elemento : "+ p4 +" não esta listado no vetor");
         }

        boolean existe1 = arraypessoa.contains(p1); // metodo contem

        if (existe1) {

            System.out.println("\no elemento : "+ p1 +" esta listado no vetor ");
        } else {

            System.out.println("\no elemento : "+ p1 +" não esta listado no vetor");
        }

        System.out.println("\n" + arraypessoa.get(2)); // metodo de busca

        arraypessoa.remove(1); //remove por indice
        arraypessoa.remove(p1); //remove por objeto

        System.out.println("\n" + arraypessoa);

        System.out.println("\n" + arraypessoa.size());


    }
}




