package apresentacao;

import dados.Contato;
import negocio.ListaTelefonica;

public class Main {

    private Scanner s = new Scanner(System.in);
    private static ListaTelefonica lista = new ListaTelefonica();

    public Contato novoContato() {
        System.out.println("Digite o nome do contato: ");
        String nome = s.nextLine();
        nome = s.nextLine();

        System.out.println("Digite o telefone do contato: ");
        int telefone = s.nextInt();

        Contato c = new Contato();
        c.setNome(nome);
        c.setTelefone(telefone);

        return c;
    }

    public void adicionarContato() {
        Contato contato = novoContato();
        lista.adicionaContato(contato);
    }

    public void removerContato() {
        System.out.println("Escolha uma letra que deseja remover: ");
        String entrada = s.next();

        if (lista.buscarContatos(entrada.charAt(0)).size() > 0) {
            exibirContatos(entrada.charAt(0));
            System.out.println("Escolha um contato para remover:");
            int index = s.nextInt();

            if (index < lista.buscarContatos(entrada.charAt(0)).size()) {
                lista.removerContato(lista.buscarContatos(entrada.charAt(0)).get(index));
            }

        } else {
            System.out.println("Nao existem contatos a serem removidos.");
        }
    }

    public void exibirContatos() {
        lista.buscarContatos().forEach((chave, lista) -> {
            System.out.println(chave + ":");
            for (Contato contato : lista) {
                System.out.println(" " + contato.toString());
            }
        });
    }

    public void exibirContatos(char letra) {
        for (int i = 0; i < lista.buscarContatos(letra).size(); i++) {
            System.out.println("Codigo: " + i);
            System.out.println(lista.buscarContatos(letra).get(i).toString());
        }
    }

}

public static void main(String[] args) {
    int opcao = 0;

    while (opcao != 4){
        System.out.println("Bem vindo a lista telefonica! O que deseja fazer?");
        System.out.println("1- Cadastrar um contato");
        System.out.println("2- Remover um contato");
        System.out.println("3- Mostrar todos os contatos");
        System.out.println("4- Sair");
    }

    switch(opcao){
        case 1:
            adicionarContato();
            break;
        case 2:
            removerContato();
            break;
        case 3:
            exibirContatos();
            break;
        case 4:
            break;
        default:
            break;
    }
}