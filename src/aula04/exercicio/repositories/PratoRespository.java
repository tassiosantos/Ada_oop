package aula04.exercicio.repositories;

import aula04.exercicio.entities.Prato;
import aula04.exercicio.entities.Restaurante;

import java.util.ArrayList;

public class PratoRespository {
    private int idPrato = 1;
    private ArrayList<Prato> pratos;

    public PratoRespository(){
        this.pratos = new ArrayList<>();
    }

    public Prato add(Prato prato){
        prato.setPratoId(idPrato);
        pratos.add(prato);
        idPrato++;
        return prato;
    }

    public void rmv(Prato prato){
        pratos.remove(prato);
    }


    public ArrayList<Prato> getPratos(){
        return pratos;
    }

    public ArrayList<Prato> getPratosByRestaurante(Restaurante restaurante){
        ArrayList<Prato> pratosDoRestaurante = new ArrayList<>();
        for (Prato prato: pratos) {
            if(prato.getRestauranteId() == restaurante.getRestauranteId()){
                pratosDoRestaurante.add(prato);
            }

        }
        return pratosDoRestaurante;
    }




}
