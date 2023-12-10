import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Main {
    public static void main(String[] args) {




//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Digite uma data no formato 'yyyy-MM-dd':");
//                String dataString = scanner.nextLine();
//
//
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//                LocalDate data = LocalDate.parse(dataString, formatter);
//
//
//                int diaDoMes = data.getDayOfMonth();
//                System.out.println("Dia do mês: " + diaDoMes);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite a data de nascimento no formato 'yyyy-MM-dd':");
//        String dataNascimentoString = scanner.nextLine();
//
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);
//
//
//        LocalDate hoje = LocalDate.now();
//        Period periodo = Period.between(dataNascimento, hoje);
//
//        System.out.println("Idade: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
        LocalTime horaAtual = LocalTime.now();

        // Formatar e imprimir a hora no formato desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaAtual.format(formatter);

        System.out.println("Hora atual: " + horaFormatada);



  }
   }

