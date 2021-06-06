package interfacepet;
import dados.*;
import java.util.Scanner;

public class SistemaPetShop {

    Veterinario[] veterinarios = new Veterinario[50];
    int quantidadeVeterinarios;
    Scanner leitor = new Scanner(System.in);
    
    public void cadastrarVeterinario(){
        System.out.println("=========================================================");
        System.out.println("Informe o nome e o salario do veterinario a ser cadastrado: " + leitor.nextLine() + leitor.nextInt());
        
        usuario();
    }

    public void mostrarVeterinarios(){
        for (int i = 0; i < quantidadeVeterinarios; i++){
            System.out.println("\n=========================================================\n" +
            "Veterinario " + (i+1) + ": \n" +
            "Nome: " + veterinarios[i].getNome() + "\n" +
            "Salario: " + veterinarios[i].getSalario() + "\n" +
            "Endereco: " + veterinarios[i].getEndereco() + "\n" +
            "Quantidade animais: " + veterinarios[i].getQuantidadeAnimais() + "\n" +
            "Animais: " + veterinarios[i].getAnimais() + "\n"
            + "\n=========================================================\n");
        }
        usuario();
    }

    public void cadastrarEnderecoVeterinario(){
        System.out.println("=========================================================");
        System.out.println("");
        usuario();
    }

    public void mostrarAnimais(){
        mostrarVeterinarios();
        System.out.println("Qual veterinario deseja visualizar os animais cadastrados? " + leitor.next());
        
        leitor.close();
        usuario();
    }
    
    public void cadastrarDono(){

        usuario();
    }

    public void cadastrarEnderecoDano(){
        System.out.println("=========================================================");
        mostrarAnimais();
        System.out.println("=========================================================");
        System.out.println("Informe o animal que deseja cadastrar o endereco do dono.");

        usuario();
    }

    public void usuario(){
        System.out.println("1: Cadastrar um veterinario.");
        System.out.println("2: Mostar todos os veterinarios.");
        System.out.println("3: Cadastrar endereco de um veterinario.");
        System.out.println("4: Cadastrar um animal a um funcionario.");
        System.out.println("5: ");
        System.out.println("6: ");
        System.out.println("7: Cadastrar endereco de um dono.");
    }
}
