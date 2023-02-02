package br.loiane.vetor;
import br.loiane.vetor.estrutura_vetor.arrays.Lista;

public class Teste2 {

    public static void main(String[] args){

        Lista<String> lista = new Lista<String>(2);

        lista.adiciona("5");
        lista.adiciona("5");
        lista.adiciona("5");
        lista.adiciona("5");
        lista.adiciona("5");

        System.out.println(lista.toString());




    }

}
