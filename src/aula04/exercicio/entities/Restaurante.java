package aula04.exercicio.entities;

import java.util.ArrayList;

public class Restaurante {
    private int restauranteId;
    private String nome;
    private String endereco;
    private ArrayList<Prato> pratos = new ArrayList<>();

    public Restaurante(){}
    public Restaurante(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public Restaurante(String nome, String endereco, int restauranteId){
        this.nome = nome;
        this.endereco = endereco;
        this.restauranteId = restauranteId;
    }


    public Restaurante(String nome, String endereco, ArrayList<Prato> pratos){
        this.nome = nome;
        this.endereco = endereco;
        this.pratos = pratos;
    }

    public String getNome() {
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }

    public ArrayList<Prato> getPratos(){
        return pratos;
    }

    public int getRestauranteId() {
        return restauranteId;
    }

    @Override
    public String toString() {
        return "Restaurante: " + getNome() + "\nId: " + getRestauranteId() + "\nEndereço: "+getEndereco();
    }
}
