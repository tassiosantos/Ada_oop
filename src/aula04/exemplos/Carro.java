package aula04.exemplos;

public class Carro extends Veiculo{
    private int qtdPortas;
    private String tpCombustivel;

    public Carro(String placa, String cor, String modelo, String ano, int qtdPortas, String tpCombustivel) {
        super(placa, cor, modelo, ano);
        this.qtdPortas = qtdPortas;
        this.tpCombustivel = tpCombustivel;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public String getTpCombustivel() {
        return tpCombustivel;
    }

    @Override
    public String exibirDados() {
        return "Carro: \n" + super.exibirDados() + "\nPortas: " + getQtdPortas() + "\nCombustível: " + getTpCombustivel();
    }
}
