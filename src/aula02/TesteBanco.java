package aula02;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class TesteBanco {
    public static Banco banco = new Banco();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Banco ADA");
        while(true){
            printMenu();
            int escolha = receberEscolha(scan);
            if(escolha == 5)
                break;
            switch (escolha){
                case(1):
                    newConta(scan);
                    break;
                case(2):
                    banco.deposit(scan);
                    break;
                case(3):
                    banco.whidraw(scan);
                    break;
                case(4):
                    getAccount(scan);
                    break;
            }
        }



    }
    private static int receberEscolha(Scanner scan) throws IllegalArgumentException {
        try{
            int escolha = scan.nextInt();
            return escolha;
        }
        catch (Exception e){
            System.out.println("Favor digitar um valor válido");
            return -1;
        }
     }


    private static void printMenu() {
        System.out.println("Qual opção deseja utilizar?");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Realizar deposito");
        System.out.println("3 - Realizar saque");
        System.out.println("4 - Consultar conta");
        System.out.println("5 - Sair");
    }

    private static Cliente newCliente(Scanner scan){
        System.out.println("Digite o nome do cliente");
        String nome = scan.next();
        System.out.println("Digite o CPF do cliente");
        String cpf = scan.next();
        System.out.println("Digite o emaill do cliente");
        String email = scan.next();
        return new Cliente(nome, cpf, email);
        }

    private static String newConta(Scanner scan){
        return banco.criarConta(newCliente(scan));
    }




    private static void getAccount(Scanner scan){
        System.out.println("Digite o número da conta que deseja consultar");
        String numeroConta = scan.next();
        Conta conta = banco.buscarConta(numeroConta);
        if(conta == null){
            System.out.println("Número de conta inválido");
        }else{
            System.out.println(conta.toString());

        }
    }

}
