package aula02;

import org.w3c.dom.ls.LSOutput;

public class Conta {

    Cliente cliente = new Cliente();
    String numeroConta;

    Double saldo;

    public Conta(Cliente cliente, String numeroConta){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }


    public double depositar(double entrada) throws IllegalArgumentException{
        try{
            if(entrada < 0){
                System.out.println("Não é possível depositar um valor negativo. Está tentando realizar um saque?");
                return -1;
            }
            System.out.println("Depósito realizado");
            this.saldo += entrada;
            return this.saldo;
        }catch (Exception e){
            System.out.println("Valor digitado é inválido.");
        }
        return  -1;
    }

    public  double sacar(double saida) throws IllegalArgumentException{
        try{
            if(saida < 0 ){
                System.out.println("Não é possível sacar um valor negativo. Está tentando realizar um depósito?");
                return -1;
            }
            if(this.saldo>saida){
                System.out.println("Saque realizado");
                this.saldo = this.saldo - saida;
                return this.saldo;
            }else{
                System.out.println("Valor que deseja sacar é maior do que o saldo em conta");
                return -1;
            }

        }catch (Exception e){
            System.out.println("Entrada inválida, o que está tentando fazer?");
        }
        return -1;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Conta conta){
            if(conta.numeroConta.equals(((Conta) obj).numeroConta));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String conta = "Conta: " + this.numeroConta + "\nCliente: " + this.cliente + "\nSaldo: " + this.saldo;
        return conta;
    }
}
