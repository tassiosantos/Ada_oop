package aula04.exercicio.controllers;

import aula04.exercicio.entities.Restaurante;
import aula04.exercicio.services.RestauranteService;

import java.util.ArrayList;
import java.util.Scanner;

public class RestauranteController {
    Scanner scan = new Scanner(System.in);
    private RestauranteService restauranteService;

    public RestauranteController(){
        this.restauranteService = new RestauranteService();
    }

    public RestauranteController(RestauranteService restauranteService){}


    public Restaurante novoRestaurante(){
        System.out.println("Qual nome do novo restaurante?");
        String nome = scan.nextLine();
        System.out.println("Digite o endereço do restaurante:");
        String endereco = scan.nextLine();
        Restaurante restaurante = restauranteService.adicionarRestaurante(nome, endereco);
        System.out.println(restaurante.toString() +  "\nAdicionado");
        return restaurante;
    }


    public ArrayList<Restaurante> listarRestaurantes(){
        ArrayList<Restaurante> restaurantes = restauranteService.listarRestaurantes();
        if(restaurantes.isEmpty()){
            System.out.println("Lista de restaurante vazia. Favor adicionar algum restaurante.");
            return null;
        }
        System.out.println("_________________________________________________");
        System.out.println("Lista de restaurantes:");
        for(Restaurante restaurante: this.restauranteService.listarRestaurantes()){
            System.out.println(restaurante.toString());
            System.out.println();
        }
        return restaurantes;
    }



}
