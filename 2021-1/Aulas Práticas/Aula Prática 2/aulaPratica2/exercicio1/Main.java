package aulaPratica2.exercicio1;

public class Main {

    public static void main(String[] args) {
        
        Grupo g = new Grupo();

        Pessoa p1 = new Pessoa();
        p1.setNome("Jab");
        p1.setIdade(19);
        p1.setAltura(1.70f);
        p1.setMassa(57.0f);

        Pessoa p2 = new Pessoa();
        p2.setNome("Dan");
        p2.setIdade(22);
        p2.setAltura(1.74f);
        p2.setMassa(80.0f);

        Pessoa p3 = new Pessoa();
        p3.setNome("Takito");
        p3.setAltura(1.70f);
        p3.setIdade(21);
        p3.setMassa(60.0f);

        Pessoa p4 = new Pessoa();
        p4.setNome("Kalyl");
        p4.setIdade(21);
        p4.setAltura(1.89f);
        p4.setMassa(90.0f);

        Pessoa p5 = new Pessoa();
        p5.setNome("Michael");
        p5.setIdade(19);
        p5.setAltura(1.60f);
        p5.setMassa(60.0f);

        Pessoa p6 = new Pessoa();
        p6.setNome("Andrezao");
        p6.setIdade(19);
        p6.setAltura(1.90f);
        p6.setMassa(120.0f);

        g.setPessoa(p1);
        g.setPessoa(p2);
        g.setPessoa(p3);
        g.setPessoa(p4);
        g.setPessoa(p5);
        g.setPessoa(p6);
        g.ordena();

        for(int i=0; i < 6; i++){
            System.out.println("Nome: " + g.getPessoas()[i].getNome());
            System.out.println("Altura: " + g.getPessoas()[i].getAltura());
            System.out.println("Idade: " + g.getPessoas()[i].getIdade());     
            System.out.println("Massa: " + g.getPessoas()[i].getMassa());
            System.out.println("IMC: " + g.getPessoas()[i].calculaIMC() + "\n");                    
        }

    }
    
}
