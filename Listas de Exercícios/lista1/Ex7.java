import java.util.Scanner;
import java.util.Calendar;

public class Ex7 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dia_pc = calendar.get(Calendar.DATE+1);
        int mes_pc = calendar.get(Calendar.MONTH+1);
        int ano_pc = calendar.get(Calendar.YEAR);

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a data de nascimento");
        System.out.println("Dia:");
        int dia = leitor.nextInt();
        System.out.println("Mes:");
        int mes = leitor.nextInt();
        System.out.println("Ano:");
        int ano = leitor.nextInt();

        if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano > ano_pc){
            System.out.println("Data invalida. Tente novamente.");
            System.exit(0);
        }
        
        int contaAnosAnteriores = 365 * (ano_pc - ano - 2);
        int contaDiasAnoAtual = ((mes_pc-1)*30 + (30 - dia_pc));
        int contaMesesAnoNascimento = 30 * (12 - mes); 
        int dias = contaAnosAnteriores + contaDiasAnoAtual + contaMesesAnoNascimento;

        System.out.println("Voce tem aproximadamente " + dias + " dias de vida, continue assim!");

        leitor.close();
    }
    
}