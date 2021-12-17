package cursoJava.dataApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DataApi {

	public static void main(String[] args) {
		
	    LocalDate data = LocalDate.now();
	    System.out.println(data);
	    
	    LocalDate data2 = LocalDate.of(1990, Month.AUGUST, 6);
	    System.out.println(data2);
	    LocalDate data3 = data2.plusWeeks(2).plusDays(1).minusMonths(1);
	    System.out.println(data3);
	    
	    
	    LocalTime hora = LocalTime.now();
	    System.out.println(hora);
	    LocalTime hora2 = LocalTime.of(11, 10, 01, 100000);
	    System.out.println(hora2);
	    
	   
	    LocalDateTime dataCompleta = LocalDateTime.now();
	    System.out.println(dataCompleta);
	    LocalDateTime dataCompleta2 = LocalDateTime.of(data, hora);
	    System.out.println(dataCompleta2);
	    
	    
	    Instant instante = Instant.now();
	    System.out.println(instante);
	    Instant instanteEspecifico = Instant.ofEpochMilli(500000000000L);
	    System.out.println(instanteEspecifico);
	    //Instant instanteErro = instanteEspecifico.plus(1, ChronoUnit.MONTHS);
	    //System.out.println(instanteErro);
	    

	    ZonedDateTime fuso = ZonedDateTime.now();
	    System.out.println(fuso);
	    ZoneId fusoId = ZoneId.of("Europe/Paris");
	    ZonedDateTime fusoId2 = ZonedDateTime.of(data, hora, fusoId);
	    System.out.println(fusoId2);
	    
	    
	    

	}    
	
}
