package aula04.exercicio.services;

import aula04.exercicio.entities.Prato;
import aula04.exercicio.entities.Restaurante;
import aula04.exercicio.repositories.RestauranteRepository;

import java.util.ArrayList;

public class RestauranteService {
    private static RestauranteRepository restauranteRepository;
    public RestauranteService(){
        restauranteRepository = new RestauranteRepository();

    }

    public Restaurante adicionarRestaurante(String nome, String endereco){
        Restaurante restaurante = new Restaurante(nome, endereco, restauranteRepository.getRestauranteId());
        return restauranteRepository.add(restaurante);
    }

    public ArrayList<Restaurante> listarRestaurantes(){
        return restauranteRepository.getRestaurantes();
    }


    public Restaurante buscarRestaurante(int restauranteId) {
        return restauranteRepository.getRestauranteById(restauranteId);
    }

    public ArrayList<Prato> listarPratosByRestaurante(Restaurante restaurante){
        return restaurante.getPratos();
    }
}
