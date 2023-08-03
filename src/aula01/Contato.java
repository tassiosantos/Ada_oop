package aula01;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Contato {

    String nomeContato;
    String descricaoContato;
    String numeroContato;

    public  Contato(){};
    public Contato(String nome, String descricao, String numero){
        this.nomeContato = nome;
        this.descricaoContato = descricao;
        this.numeroContato = numero;
    }

    public void ligar(){
        System.out.println("Ligando para " + this.nomeContato + ": " + this.numeroContato);
    }

    public void detalhar(){
        System.out.println("Descrição de " + this.nomeContato + ": " + this.descricaoContato);
    }

    public void verNumero(){
        System.out.println("Número de " + this.nomeContato + ": " + this.numeroContato);
    }






}
