package aula04.exercicio.entities;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String contato;

    private ArrayList<Pedido> pedidos;

    public Cliente(){}

    public Cliente(String nome, String contato){
        this.nome = nome;
        this.contato = contato;
        this.pedidos = new ArrayList<>();
    }

    public Cliente(String nome, String contato, ArrayList<Pedido> pedidos){
        this.nome = nome;
        this.contato = contato;
        this.pedidos = pedidos;
    }

    public String getNome(){
        return this.nome;
    }


    public String getContato() {
        return this.contato;
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nContato: " + getContato();
    }
}
