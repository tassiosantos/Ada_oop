package aula04.exercicio.services;

import aula04.exercicio.entities.Prato;
import aula04.exercicio.entities.Restaurante;
import aula04.exercicio.repositories.PratoRespository;

import java.util.ArrayList;

public class PratoService {

    private static PratoRespository pratoRespository;
    public PratoService(){
        pratoRespository = new PratoRespository();
    }

    public Prato adicionarPrato(String nome, double preco, String descricao, int restauranteId){
        Prato prato = new Prato(nome, preco, descricao, restauranteId);
        return pratoRespository.add(prato);
    }

    public ArrayList<Prato> listarPratos(){
        return pratoRespository.getPratos();
    }

    public ArrayList<Prato> listarPratosByRestaurante(Restaurante restaurante){
        return pratoRespository.getPratosByRestaurante(restaurante);
    }


    public Prato buscarPrato(int pratoId){
        return pratoRespository.getPratoById(pratoId);
    }


}
