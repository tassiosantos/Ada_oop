package aula04.exercicio.controllers;

import aula04.exercicio.entities.Prato;
import aula04.exercicio.entities.Restaurante;
import aula04.exercicio.services.PratoService;
import aula04.exercicio.services.RestauranteService;

import java.util.ArrayList;
import java.util.Scanner;

public class PratoController {

    Scanner scan = new Scanner(System.in);
    private PratoService pratoService;
    private RestauranteService restauranteService;

    public PratoController(){
        pratoService = new PratoService();
        restauranteService = new RestauranteService();
    }


    public Prato adicionarPrato(){
        if(restauranteService.listarRestaurantes().isEmpty()) {
            System.out.println("Lista de restaurante vazia. Favor adicionar algum restaurante.");
            return null;
        }
        System.out.println("_________________________________________________");
        System.out.println("Lista de restaurantes:");
        for(Restaurante restaurante: this.restauranteService.listarRestaurantes()){
            System.out.println(restaurante.toString());
            System.out.println();
        }
        System.out.println("Qual id do restaurante?");
        int restauranteId = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o nome do prato:");
        String nome = scan.nextLine();
        System.out.println("Digite a descrição do prato:");
        String descricao = scan.nextLine();
        System.out.println("Digite o preço do prato:");
//        scan.nextDouble();
        double preco = scan.nextDouble();
        Prato prato = pratoService.adicionarPrato(nome, preco, descricao, restauranteId);
//        restauranteService.buscarRestaurante(restauranteId).
        System.out.println(prato.toString() + "\nAdicionado");
        return prato;

    }

    public ArrayList<Prato> listarPratosByRestaurante(){
        if(restauranteService.listarRestaurantes().isEmpty()) {
            System.out.println("Lista de restaurante vazia. Favor adicionar algum restaurante.");
            return null;
        }
        System.out.println("_________________________________________________");
        System.out.println("Lista de restaurantes:");
        for(Restaurante restaurant: this.restauranteService.listarRestaurantes()){
            System.out.println(restaurant.toString());
            System.out.println();
        }
        System.out.println("Qual id do restaurante?");
        int restauranteId = scan.nextInt();
        System.out.println();
        ArrayList<Prato> pratos = pratoService.listarPratosByRestaurante(restauranteService.buscarRestaurante(restauranteId));
        if(pratos == null){
            System.out.println("Lista de pratos vazia");
            return null;
        }else{
            for (Prato prato: pratos) {
                System.out.println(prato.toString());
            }
            return pratos;
        }


    }




}
