package aula04.exercicio;

import aula04.exercicio.controllers.*;

import java.util.Scanner;

public class SistemaRestaurante {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        RestauranteController restauranteController = new RestauranteController();
        ClienteController clienteController = new ClienteController();
        PratoController pratoController = new PratoController();
        PedidoController pedidoController = new PedidoController();
        MenuController menuController = new MenuController();


        boolean endProgram = false;
        System.out.println(clienteController.adicionarCliente());

        while (endProgram == false){
            menuController.mainMenu();
            int opcao = scan.nextInt();
            switch (opcao){
                case(1):
                    menuController.restauranteMenu();
                    int opcaoRestaurante = scan.nextInt();
                    switch (opcaoRestaurante){
                        case(1):
                            restauranteController.novoRestaurante();
                            break;
                        case(2):
                            restauranteController.listarRestaurantes();
                            break;
                        case(3):
                            pratoController.adicionarPrato();
                            break;
                        case(4):
                            pratoController.listarPratosByRestaurante();
                    }
                    break;
                case(2):
                    menuController.pedidoMenu();
                    int opcaoPedido = scan.nextInt();
                    switch (opcaoPedido){
                        case(1):
                            pedidoController.fazerPedido();
                            break;
                        case(2):
                            pedidoController.listarPedidosByRestaurante();
                            break;
                        case(3):
                            pedidoController.listarPedidos();
                            break;
                    }
                    break;
                case(3):
                    endProgram = true;
                    break;

            }







        }

    }




}
