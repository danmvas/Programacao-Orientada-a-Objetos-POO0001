import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Ex7 {

    public static void main(String[] args) {
        int ano_pc = Calendar.getInstance().get(Calendar.YEAR);

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
        
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        long dias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("Dias = " + dias);   

        leitor.close();
    }
    
}

        // int contaAnosAnteriores = 365 * (ano_pc - ano - 1);
        // int contaDiasAnoAtual = ((mes_pc-1)*30 + Calendar.getInstance().get(Calendar.));

        // int contaMesesAnoNascimento = 30 * (12 - mes); 


        // int dias = contaAnosAnteriores + contaDiasAnoAtual + contaMesesAnoNascimento;

        // System.out.println("Voce tem aproximadamente " + dias + "de vida, continue assim!");


