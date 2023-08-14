package aula04.exercicio.entities;

import java.util.ArrayList;

public class Pedido {
    private String nomeRestaurante;
    private ArrayList<Prato> nomePratos;

    private ArrayList<Integer> qtdPratos;


    private int restauranteId;

    public Pedido(){}

    public Pedido(String nomeRestaurante){
        this.nomeRestaurante = nomeRestaurante;
        this.nomePratos = new ArrayList<>();
        this.qtdPratos = new ArrayList<>();
    }

    public Pedido(String nomeRestaurante, ArrayList<Prato> nomePratos, ArrayList<Integer> qtdPratos){
        this.nomeRestaurante = nomeRestaurante;
        this.nomePratos = nomePratos;
        this.qtdPratos = qtdPratos;
    }





















}
