package br.loiane.vetor.estrutura_vetor.arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){

        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho (){
        return this.tamanho;
    }


    public boolean adiciona(String elemento){

        this.aumentacapacidade();
        if(this.tamanho < this.elementos.length){ // verifica o tamanho do vetor
            this.elementos[this.tamanho] = elemento; // adiciona o elemento no vetor
            this.tamanho ++;
            return true;
        }

        return false;
    } // caso não queira usar exeção

    public boolean adiciona(int posicao, String elemento) throws IllegalAccessException {

        this.aumentacapacidade();
         if(!(posicao >= 0 && posicao< tamanho)) {
            throw new IllegalAccessException("posição invalida");
        }

        // mover todos os elementos
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void remove (int posicao) throws IllegalAccessException{

        this.aumentacapacidade();
        if(!(posicao >= 0 && posicao< tamanho)) {
            throw new IllegalAccessException("posição invalida");
        }

        for (int i =posicao; i<this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;

    }

    private void aumentacapacidade(){
        if (this.tamanho == this.elementos.length){
           String[] elementosNovos = new String[this.elementos.length * 2];
           for (int  i=0; i<this.elementos.length; i++){
               elementosNovos[i] = this.elementos[i];
           }
           this.elementos = elementosNovos;
        }
    }



    public String busca(int posicao) throws IllegalAccessException {

        if(!(posicao >=0 && posicao< tamanho)) {
            throw new IllegalAccessException("posição invalida");
        }

        return this.elementos[posicao];

    }

    public int busca(String elemento){
        for (int i=0; i<tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            } // este metodo verifica se um elemento existe no vetor
        }
        return -1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        //s.append("\n"); modifica a formatação do vetor

        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append("\n");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);

        }

        return s.toString() ;

    }


}


