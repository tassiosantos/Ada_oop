package aula04.exercicio.entities;

public class Prato {
    private int pratoId;
    private String nome;
    private double preco;

    private String descricao;

    private int restauranteId;
    public Prato(){}

    public Prato(String nome, double preco, String descricao, int restauranteId){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.restauranteId = restauranteId;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getRestauranteId(){
        return this.restauranteId;
    }

    public int getPratoId() {
        return pratoId;
    }

    public void setPratoId(int pratoId) {
        this.pratoId = pratoId;
    }

    @Override
    public String toString() {
        return "Id do prato:" + getPratoId() + "\nPrato: " + getNome() + "\nDescrição: " + getDescricao() + "\nPreço: " + getPreco();
    }
}
