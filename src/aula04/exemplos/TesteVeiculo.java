package aula04.exemplos;

public class TesteVeiculo {

    public static void main(String[] args) {
        Veiculo carro = new Carro("1231ad", "amalelo", "fusca", "2019",2, "Gasolina");

        Veiculo moto = new Moto("1231asdsadsa", "blue", "biz", "1956","750");

        System.out.println(carro.exibirDados());
        System.out.println(moto.exibirDados());
    }
}
