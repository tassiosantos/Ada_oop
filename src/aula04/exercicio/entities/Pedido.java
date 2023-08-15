package aula04.exercicio.entities;

import java.util.ArrayList;

public class Pedido {

    private String nomeRestaurante;
    private ArrayList<Prato> pratos;

    private ArrayList<Integer> qtdPratos;

    double valorPedido;

    private int restauranteId;

    public Pedido(){
        this.nomeRestaurante = "";
        this.pratos = new ArrayList<>();
        this.qtdPratos = new ArrayList<>();
    }

    public Pedido(String nomeRestaurante){
        this.nomeRestaurante = nomeRestaurante;
        this.pratos = new ArrayList<>();
        this.qtdPratos = new ArrayList<>();
    }

    public Pedido(String nomeRestaurante, ArrayList<Prato> nomePratos, ArrayList<Integer> qtdPratos, int restauranteId){
        this.nomeRestaurante = nomeRestaurante;
        this.pratos = nomePratos;
        this.qtdPratos = qtdPratos;
        this.restauranteId = restauranteId;
        this.valorPedido = 0;
    }


    public double totalPedido(){
        Prato[] arrayPratos = pratos.toArray(new Prato[pratos.size()]);
        Integer[] arrayQtdPratos = qtdPratos.toArray(new Integer[qtdPratos.size()]);
        for (int i = 0; i<arrayPratos.length; i++){
            valorPedido += arrayPratos[i].getPreco()*arrayQtdPratos[i];
        }
        return  valorPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public int getRestauranteId(){
        return this.restauranteId;
    }

    public void setRestauranteId(int restauranteId){
        this.restauranteId = restauranteId;
    }


    public void addPrato(Prato prato){
        this.pratos.add(prato);
    }

    public  void addQuantidadePrato(int qtd){
        this.qtdPratos.add(qtd);
    }


    public ArrayList<Prato> getPratos(){
        return this.pratos;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public ArrayList<Integer> getQtdPratos() {
        return qtdPratos;
    }

    @Override
    public String toString() {
        return "Pedido: ";
    }
}
