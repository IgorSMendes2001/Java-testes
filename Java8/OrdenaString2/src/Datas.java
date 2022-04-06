package src;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Datas {
    public static void main(String[] args) {
        LocalDate hoje= LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio=LocalDate.of(2016, 06, 12);
        int anos=olimpiadasRio.getYear()-hoje.getYear();
        System.out.println(anos);
        Period periodo=Period.between(hoje, olimpiadasRio);
        System.out.println(periodo.getDays());
        LocalDate proximasOlimpiadas=olimpiadasRio.plusYears(6);
        System.out.println(proximasOlimpiadas);
        DateTimeFormatter formatador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado=proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);
        DateTimeFormatter formatadorComHoras=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora=LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));
    }
}
