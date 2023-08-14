package aula04.exercicio.controllers;

import aula04.exercicio.entities.Prato;
import aula04.exercicio.entities.Restaurante;
import aula04.exercicio.services.PedidoService;
import aula04.exercicio.services.RestauranteService;

import java.util.Scanner;

public class PedidoController {

    Scanner scan = new Scanner(System.in);

    private PedidoService pedidoService;
    private RestauranteService restauranteService;


    public PedidoController(){
        pedidoService = new PedidoService();
        restauranteService = new RestauranteService();
    }



    public String novoPedido(){
        System.out.println("Em qual restaurante deseja fazer o pedido:");
        System.out.println(restauranteService.listarRestaurantes().toString());
        return null;
    }


    public String fazerPedido(){
        if(restauranteService.listarRestaurantes().isEmpty())
            return "Lista de restaurante vazia. Favor adicionar um restaurante";
        System.out.println("_________________________________________________");
        System.out.println("Lista de restaurantes:");
        for(Restaurante restaurante: this.restauranteService.listarRestaurantes()){
            System.out.println(restaurante.toString());
            System.out.println();
        }
        System.out.println("Digite o id do restaurante que deseja fazer o pedido");
        int restauranteId = scan.nextInt();
        Restaurante restaurante = restauranteService.buscarRestaurante(restauranteId);
        if(restaurante == null){
            System.out.println("Não existe restaurante com esse ID, favor digitar um ID válido.");
        }else{
            for (Prato prato: restaurante.getPratos()) {
                System.out.println(prato.toString());
            }
            System.out.println("Digite o ID do prato que desseja adicionar:");
        }

        return null;
    }

    public String listarPedidos(){
//        return this.pedidoService.listarPedidos();
    return null;
    }





}
