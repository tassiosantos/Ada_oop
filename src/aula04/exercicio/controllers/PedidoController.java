package aula04.exercicio.controllers;

import aula04.exercicio.entities.Pedido;
import aula04.exercicio.entities.Prato;
import aula04.exercicio.entities.Restaurante;
import aula04.exercicio.services.PedidoService;
import aula04.exercicio.services.PratoService;
import aula04.exercicio.services.RestauranteService;

import java.util.ArrayList;
import java.util.Scanner;

public class PedidoController {

    Scanner scan = new Scanner(System.in);

    private PratoService pratoService;
    private PedidoService pedidoService;
    private RestauranteService restauranteService;


    public PedidoController(){
        pratoService = new PratoService();
        pedidoService = new PedidoService();
        restauranteService = new RestauranteService();
    }



    public String novoPedido(){
        System.out.println("Em qual restaurante deseja fazer o pedido:");
        System.out.println(restauranteService.listarRestaurantes().toString());
        return null;
    }


    public Pedido fazerPedido(){
        if(restauranteService.listarRestaurantes().isEmpty()) {
            System.out.println("Lista de restaurante vazia. Favor adicionar um restaurante");
            return null;
        }
        System.out.println("_________________________________________________");
        System.out.println("Lista de restaurantes:");
        for(Restaurante restaurante: this.restauranteService.listarRestaurantes()){
            System.out.println(restaurante.toString());
            System.out.println();
        }
        System.out.println("Digite o id do restaurante que deseja fazer o pedido");
        int restauranteId = scan.nextInt();
        scan.nextLine();
        Restaurante restaurante = restauranteService.buscarRestaurante(restauranteId);
        if(restaurante == null){
            System.out.println("Não existe restaurante com esse ID, favor digitar um ID válido.");
        }else{
            Pedido pedido = new Pedido();
            pedido.setRestauranteId(restauranteId);
            pedido.setNomeRestaurante(restaurante.getNome());
//            ArrayList<Prato> pratos = restauranteService.listarPratosByRestaurante(restaurante);
            ArrayList<Prato> pratos = pratoService.listarPratosByRestaurante(restaurante);
            if(pratos.isEmpty()) {
                System.out.println("Restaurante sem uma lista de pratos. Favor adicionar algum prato.");
                return null;
            }
            while(true){
                for (Prato prato: pratos) {
                    System.out.println(prato.toString());
                }
                System.out.println("Qual ID do prato que deseja adicionar ao pedido?");
                int pratoId = scan.nextInt();
                scan.nextLine();
                Prato prato = pratoService.buscarPrato(pratoId);
                if(prato.getRestauranteId() == restauranteId) {
                    System.out.println("Qual a quantidade de " + prato.getNome() + " deseja adicionar?");
                    int qtdPratos = scan.nextInt();
                    scan.nextLine();
                    pedido.addPrato(prato);
                    pedido.addQuantidadePrato(qtdPratos);
                }else{
                    System.out.println("ID não correspondente aos pratos do restaurante.");
                }
                System.out.println("Deseja adicionar um novo prato no pedido?");
                System.out.println("1 - Sim \n2 - Não");
                if(scan.nextInt() != 1){break;}

            }
            pedidoService.adicionarPedido(pedido);
            System.out.println("O total do pedido é: " + pedido.totalPedido());
            return pedido;
        }

        return null;
    }

    public ArrayList<Pedido> listarPedidosByRestaurante(){
        if(restauranteService.listarRestaurantes().isEmpty()) {
            System.out.println("Lista de restaurante vazia. Favor adicionar um restaurante");
            return null;
        }
        System.out.println("_________________________________________________");
        System.out.println("Lista de restaurantes:");
        for(Restaurante restaurante: this.restauranteService.listarRestaurantes()){
            System.out.println(restaurante.toString());
            System.out.println();
        }
        System.out.println("Digite o id do restaurante que deseja a lista de pedidos");
        int restauranteId = scan.nextInt();
        ArrayList<Pedido> pedidosRestaurante = this.pedidoService.listarPedidosRestaurante(restauranteId);
        if(pedidosRestaurante.isEmpty()){
            System.out.println("Lista de pedidos vazia.");
            return null;
        }else{
            System.out.println(restauranteService.buscarRestaurante(restauranteId).getNome());
            for (Pedido pedido: pedidoService.listarPedidosRestaurante(restauranteId)) {
                for (int i =0; i < pedido.getPratos().size(); i++) {
                    System.out.println(pedido.getPratos().get(i).getNome() + " " + pedido.getQtdPratos().get(i) );

                }
                System.out.println("Total pedido: " + pedido.getValorPedido());
                System.out.println("______________________________________________________");
            }

        }
        return pedidosRestaurante;


    }


    public ArrayList<Pedido> listarPedidos(){
        ArrayList<Restaurante> restaurantes = restauranteService.listarRestaurantes();
        if(restaurantes.isEmpty()) {
            System.out.println("Lista de restaurante vazia. Favor adicionar um restaurante");
            return null;
        }
        System.out.println("______________________________________________________");
        ArrayList<Pedido> pedidos = new ArrayList<>();
        for (Restaurante restaurante: restaurantes) {
            for (Pedido pedido: pedidoService.listarPedidosRestaurante(restaurante.getRestauranteId())) {
                pedidos.add(pedido);
                System.out.println(pedido.getNomeRestaurante());

                for (int i =0; i < pedido.getPratos().size(); i++) {
                    System.out.println(pedido.getPratos().get(i).getNome() + " " + pedido.getQtdPratos().get(i) );

                }
                System.out.println("Total pedido: " + pedido.getValorPedido());
            }
            System.out.println("______________________________________________________");
        }
        if(pedidos.isEmpty()){
            System.out.println("Lista de pedidos vazia.");
            return null;
        }else{
            return pedidos;
        }

    }





}
