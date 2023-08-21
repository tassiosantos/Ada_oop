package aula07;

import aula07.Contrato.Pilha;

import java.util.ArrayList;

public class PilhaUm extends Pilha {
    public Elemento primeiro;
    public Elemento ultimo;

    public PilhaUm(){
        primeiro = null;

    }
    @Override
    public void push(Object obj) {
        Elemento pushed = new Elemento(obj);
        if(primeiro != null){
            pushed.setProximo(null);
            pushed.setAnterior(ultimo);
            this.ultimo.setProximo(pushed);
            this.ultimo = pushed;
        }else{
            primeiro = pushed;
            primeiro.setAnterior(null);
            primeiro.setProximo(null);
            ultimo = primeiro;

        }

    }

    @Override
    public String toString() {
        String pilha = "";
        Elemento parada = ultimo;
        while(parada != null){
            pilha = pilha + "\n" + parada.getObj();
            parada = parada.getAnterior();
        }

        return pilha;
    }

    @Override
    public void pop() {
        if(ultimo.getAnterior() != null){
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }else{
            System.out.println("Pilha vazia");
        }


    }

    @Override
    public Object peek() {
        return this.ultimo;
    }


    class Elemento {
        private Object obj;
        private Elemento proximo;

        private  Elemento anterior;

        public Elemento(Object obj) {
            this.obj = obj;
        }

        public Object getObj() {
            return obj;
        }

        public Elemento getProximo() {
            return proximo;
        }

        public void setProximo(Elemento proximo) {
            this.proximo = proximo;
        }

        public Elemento getAnterior() {
            return anterior;
        }

        public void setAnterior(Elemento anterior) {
            this.anterior = anterior;
        }
    }
}
