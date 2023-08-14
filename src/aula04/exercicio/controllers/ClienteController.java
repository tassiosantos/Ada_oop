package aula04.exercicio.controllers;

import aula04.exercicio.entities.Cliente;
import aula04.exercicio.services.ClienteService;

import java.util.Scanner;

public class ClienteController {

    Scanner scan = new Scanner(System.in);

    ClienteService clienteService = new ClienteService();



    public String adicionarCliente(){
        System.out.println("Digite seu nome:");
        String nome = scan.next();
        System.out.println("Digite seu contato:");
        String contato = scan.next();

        return clienteService.adicionarCliente(nome, contato).toString() + "\nAdicionado";

    }



}
