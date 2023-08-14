package aula02;

public class Cliente {

    private String nome, cpf, email;

    public Cliente(){}
    public  Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Cliente cliente){
            return (((Cliente) obj).cpf.equals(cliente.cpf)?true:false);
        }
        return false;
    }

    @Override
    public String toString() {
        String cliente = "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nEmail: " + this.email;
        return cliente;
    }


}
