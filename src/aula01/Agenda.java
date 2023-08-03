package aula01;

import java.sql.Array;
import java.util.ArrayList;

public class Agenda {

    public ArrayList<Contato> contatos = new ArrayList<>();

    public  Agenda(){};
    public Agenda(ArrayList<Contato> contatos){
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato){
        System.out.println("Adicionando: " + contato.nomeContato + " " + contato.descricaoContato + ", número: " + contato.numeroContato);
        contatos.add(contato);
    }

    public void deletarContato(Contato contato){
        System.out.println("Removendo: " + contato.nomeContato + ", número: " + contato.numeroContato);
        contatos.remove(contato);
    }

    public void buscarContato(String nomeContato){
        for (Contato contato: contatos) {
            if(contato.nomeContato.equals(nomeContato)){
                System.out.println("Contato " + contato.nomeContato + ": " + contato.numeroContato);
                System.out.println("Descrição: " + contato.descricaoContato);
            }

        }
    }





}
