package aula04.exercicio.controllers;

public class MenuController {

    public void mainMenu(){
        System.out.println("Qual opção deseja seguir:");
        System.out.println("1 - Restaurantes");
        System.out.println("2 - Pedidos");
        System.out.println("3 - Sair");
    }

    public void restauranteMenu(){
        System.out.println("Qual opção deseja realizar?");
        System.out.println("1 - Cadastrar restaurante");
        System.out.println("2 - Listar restaurantes");
        System.out.println("3 - Adicionar prato");
        System.out.println("4 - Listar pratos");
    }


    public void pedidoMenu(){
        System.out.println("1 - Fazer pedido");
        System.out.println("2 - Listar pedidos");

    }
}
