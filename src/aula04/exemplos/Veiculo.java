package aula04.exemplos;

public class Veiculo {
    private String placa;
    private String cor;
    private String modelo;

    private String ano;
    public Veiculo (String placa, String cor, String modelo, String ano){
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String exibirDados(){
        return "Placa: " + getPlaca() + "\nCor: " + getCor() + "\nModelo: " + getModelo();
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno(){
        return this.ano;
    }
}
