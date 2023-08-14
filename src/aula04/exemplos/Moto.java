package aula04.exemplos;

public class Moto extends Veiculo{
    private String cilindradas;
    public  Moto(String placa, String cor, String modelo, String ano, String cilindradas){
        super(placa, cor, modelo, ano);
        this.cilindradas = cilindradas;
    }


    @Override
    public String exibirDados(){
        return "Moto: \n" + super.exibirDados() + "\nCilindradas: " + getCilindradas();
    }


    public String getCilindradas(){
        return this.cilindradas;
    }
}
