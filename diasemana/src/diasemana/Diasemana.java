package diasemana;
import java.util.Calendar;

public class Diasemana {

    public static void main(String[] args) {
        
        Calendar calen = Calendar.getInstance();
        
        int dia, numerodia, numeromes, ano;
        int hora, minutos, segundos;
        
        numerodia = calen.get(Calendar.DATE);
        switch(numerodia){
            case 1 -> System.out.println("Hoje e dia 1!");
            case 2 -> System.out.println("Hoje e dia 2!");
            case 3 -> System.out.println("Hoje e dia 3!");
            case 4 -> System.out.println("Hoje e dia 4!");
            case 5 -> System.out.println("Hoje e dia 5!");
            case 6 -> System.out.println("Hoje e dia 6!");
            case 7 -> System.out.println("Hoje e dia 7!");
            case 8 -> System.out.println("Hoje e dia 8!");
            case 9 -> System.out.println("Hoje e dia 9!");
            case 10 -> System.out.println("Hoje e dia 10!");
            case 11 -> System.out.println("Hoje e dia 11!");
            case 12 -> System.out.println("Hoje e dia 12!");
            case 13 -> System.out.println("Hoje e dia 13!");
            case 14 -> System.out.println("Hoje e dia 14!");
            case 15 -> System.out.println("Hoje e dia 15!");
            case 16 -> System.out.println("Hoje e dia 16!");
            case 17 -> System.out.println("Hoje e dia 17!");
            case 18 -> System.out.println("Hoje e dia 18!");
            case 19 -> System.out.println("Hoje e dia 19!");
            case 20 -> System.out.println("Hoje e dia 20!");
            case 21 -> System.out.println("Hoje e dia 21!");
            case 22 -> System.out.println("Hoje e dia 22!");
            case 23 -> System.out.println("Hoje e dia 23!");
            case 24 -> System.out.println("Hoje e dia 24!");
            case 25 -> System.out.println("Hoje e dia 25!");
            case 26 -> System.out.println("Hoje e dia 26!");
            case 27 -> System.out.println("Hoje e dia 27!");
            case 28 -> System.out.println("Hoje e dia 28!");
            case 29 -> System.out.println("Hoje e dia 29!");
            case 30 -> System.out.println("Hoje e dia 30!");
            default -> System.out.println("Hoje e dia 31!");
        }
        
        
        dia = calen.get(Calendar.DAY_OF_WEEK);
        switch(dia){
            case 1 -> System.out.println("Hoje e Domingo!");
            case 2 -> System.out.println("Hoje e Segunda-Feira!");
            case 3 -> System.out.println("Hoje e Terça-Feira!");
            case 4 -> System.out.println("Hoje e Quarta-Feira!");
            case 5 -> System.out.println("Hoje e Quinta-Feira!");
            case 6 -> System.out.println("Hoje e Sexta-Feira!");
            default -> System.out.println("Hoje e Sábado!");
        }
        
        numeromes = calen.get(Calendar.MONTH);
        switch(numeromes){
            case 1 -> System.out.println("Estamos no Mes Janeiro");
            case 2 -> System.out.println("Estamos no Mes Fevereiro");
            case 3 -> System.out.println("Estamos no Mes Março");
            case 4 -> System.out.println("Estamos no Mes Abril");
            case 5 -> System.out.println("Estamos no Mes Maio");
            case 6 -> System.out.println("Estamos no Mes Junho");
            case 7 -> System.out.println("Estamos no Mes Julho");
            case 8 -> System.out.println("Estamos no Mes Agosto");
            case 9 -> System.out.println("Estamos no Mes Setembro");  
            case 10 -> System.out.println("Estamos no Mes Outubro");
            case 11 -> System.out.println("Estamos no Mes Novembro");
            default -> System.out.println("Estamos no Mes Dezembro"); 
        }
        
        ano = calen.get(Calendar.YEAR);
        System.out.println("O ano e de " + ano);
        
        
        hora = calen.get(Calendar.HOUR_OF_DAY);
        minutos = calen.get(Calendar.MINUTE);
        segundos = calen.get(Calendar.SECOND);
        System.out.println("E o horario e: " + hora + ":" + minutos + ":" + segundos);
        
    }
    
}
