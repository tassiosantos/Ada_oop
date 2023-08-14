package aula02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
    ArrayList<Conta> contas = new ArrayList<>();
    int qtdContas;

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public int getQtdContas() {
        return qtdContas;
    }

    public void setQtdContas(int qtdContas) {
        this.qtdContas = qtdContas;
    }

    public Banco(){
        this.qtdContas = 0;
    }
    public Banco(ArrayList<Conta> contas){
        this.contas = contas;
        this.qtdContas = contas.size();
    }

    public String criarConta(Cliente cliente){
        Conta conta = new Conta(cliente,Integer.toString(qtdContas));
        System.out.println("Criando conta...");
        System.out.println(conta.toString());
        contas.add(conta);
        qtdContas += 1;
        return  conta.toString();


    }

    public Conta buscarConta(String numeroConta){
        for (Conta conta: contas) {
            if(conta.numeroConta.equals(numeroConta))
                return conta;

        }
        return null;
    }

    public void deposit(Scanner scan) throws InputMismatchException {
        try{
            System.out.println("Digite  numero da conta que deseja depositar");
            String numeroConta = scan.next();
            Conta conta = buscarConta(numeroConta);
            if(conta == null){
                System.out.println("Número de conta inválido");
            }else{
                System.out.println("Digite o valor que deseja depositar");
                double deposito = scan.nextDouble();
                conta.depositar(deposito);
            }
        }catch (Exception e){
            System.out.println("O que está tentando fazer?");
        }


    }

    public void whidraw(Scanner scan) {
        System.out.println("Digite  numero da conta que deseja sacar");
        String numeroConta = scan.next();
        Conta conta = buscarConta(numeroConta);
        if(conta == null){
            System.out.println("Número de conta inválido");
        }else{
            System.out.println("Digite o valor que deseja sacar");
            double saque = scan.nextDouble();
            conta.sacar(saque);
        }

    }


}
