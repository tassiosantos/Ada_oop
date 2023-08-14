package aula04.exercicio.repositories;

import aula04.exercicio.entities.Restaurante;

import java.util.ArrayList;

public class RestauranteRepository {

    public ArrayList<Restaurante> restaurantes = new ArrayList<>();
    private int restauranteId = 1;


    public Restaurante add(Restaurante restaurante){
        restaurantes.add(restaurante);
        restauranteId += 1;
        return restaurante;
    }


    public void rmv(Restaurante restaurante){
        restaurantes.remove(restaurante);
    }


    public int getRestauranteId(){
        return restauranteId;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public Restaurante getRestauranteById(int restauranteId) {
        for (Restaurante restaurante: restaurantes) {
            if(restaurante.getRestauranteId() == restauranteId){
                return restaurante;
            }

        }
        return null;
    }
}
