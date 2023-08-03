import aula01.Agenda;
import aula01.Contato;

public class Main {
    public static void main(String[] args) {

      String[] nomes = {"carlos","joão", "josé", "thiago"};
      String[] descricoes = {"amigo", "médico", "sobrinho","irmão"};
      String[] numeros = {"99009900", "9900110011", "119988222", "778882230"};

      Agenda agenda = new Agenda();

        for (int i = 0; i<nomes.length; i++) {
            agenda.adicionarContato(new Contato(nomes[i],descricoes[i],numeros[i]));
        }

        agenda.deletarContato(agenda.contatos.get(1));

        agenda.buscarContato("carlos");
        agenda.buscarContato("joão");

        agenda.adicionarContato(new Contato("joão", "médico", "9900110022"));

        agenda.buscarContato("joão");



    }
}