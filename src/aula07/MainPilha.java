package aula07;

public class MainPilha {

    public static void main(String[] args) {
        PilhaUm pilha = new PilhaUm();

        System.out.println("Pop vazio:");
        pilha.pop();
        System.out.println(pilha);


        System.out.println("Pilha 1");
        pilha.push("elemento 1");
        pilha.push("elemento 2");
        pilha.push("elemento 3");
        pilha.push("elemento 4");
        pilha.push("elemento 5");
        pilha.push("elemento 6");




        System.out.println(pilha);

    }
}
