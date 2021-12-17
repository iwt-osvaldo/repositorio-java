package cursoJava.dataApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Periodo {

	public static void main(String[] args) {
		
	    Period of = Period.of(1, 5, 0);
	    System.out.println(of);

	    Period cincoAnos = Period.ofYears(5);
	    System.out.println(cincoAnos);
	    
	    LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
	    LocalDate ld2 = ld.plusWeeks(2).plusDays(1).plusMonths(1);
	    Period between = Period.between(ld, ld2);
	    System.out.println(between);
	    
	    Period between2 = between.plusDays(10);
	    System.out.println(between2);

	    Period until = ld.until(ld2);
	    System.out.println(until);

	    LocalDate plus = ld.plus(cincoAnos);
	    System.out.println(plus);
	    
//	    LocalTime ltNow = LocalTime.now();
//	    LocalTime plus2 = ltNow.plus(cincoAnos);
//	    System.out.println(plus2);
	    
	    LocalDate nascimento = LocalDate.of(1990, Month.AUGUST, 6);
	    LocalDate hoje = LocalDate.now();
	    Period between3 = Period.between(nascimento, hoje);
	    System.out.println(between3);
	    
	    
	    Duration ofDays = Duration.ofDays(2);
	    System.out.println(ofDays);
	    
	    Duration ofHours = Duration.ofHours(1);
	    System.out.println(ofHours);
	    
	    Duration ofMinutes = Duration.ofMinutes(500);
	    System.out.println(ofMinutes);
	    
	    Duration ofSeconds = Duration.ofSeconds(10, 5000);
	    System.out.println(ofSeconds);

	    LocalTime ltNow = LocalTime.now();
	    LocalTime lt = LocalTime.of(11, 10, 01);
	   // Duration between = Duration.between(ltNow, lt);
	    System.out.println(between);
	    
	   // Duration plusMillis = between.plusMillis(500);
	   // System.out.println(plusMillis);
	    
	   // LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
	   // LocalDate ld2 = ld.plusWeeks(2).plusDays(1).minusMonths(1);    
	   // Duration between2 = Duration.between(ld, ld2);
	    System.out.println(between2);

	}

}
