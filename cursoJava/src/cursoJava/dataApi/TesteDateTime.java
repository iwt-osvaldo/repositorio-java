package cursoJava.dataApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TesteDateTime {

	public static void main(String[] args) {
		/*
		LocalDate data = LocalDate.of(2005, Month.MARCH, 12);
		
		System.out.println(data.getDayOfWeek());
		System.out.println(data.getDayOfMonth());
		System.out.println(data.getMonth());
		System.out.println(data.getYear());
		
		
		LocalDate consulta = data.plusDays(20);
		             		//data.plusMonths(3);
		             		//data.plusWeeks(1);
		             		//data.plusYears(1);
		
		LocalDate relatorio = data.minusDays(15);
							//data.minusMonths(15);
							//data.minusWeeks(15);
							//data.minusYears(15);
		
		System.out.println(data);
		System.out.println("dia da consulta: "+consulta);
		System.out.println("relatório: "+relatorio);
		
		
		LocalTime hora = LocalTime.now();
	    System.out.println("Tempo 1: "+hora);
	    LocalTime hora2 = LocalTime.of(16, 25, 41, 544000);
	    System.out.println("Tempo 2: "+hora2);
	    
	    LocalDateTime dataCompleta = LocalDateTime.now();
	    
	    LocalDateTime dataCompleta2 = LocalDateTime.of(data, hora);
	    
	  
	    
	    System.out.println(dataCompleta);
	    System.out.println(dataCompleta2.getDayOfWeek());
	    

	    Instant instante = Instant.now();
	    System.out.println(instante);
	    Instant instanteEspecifico = Instant.ofEpochMilli(43210000000000L);
	    System.out.println(instanteEspecifico);
	    
	    
	    ZonedDateTime fuso = ZonedDateTime.now();
	    System.out.println(fuso);
	    ZoneId fusoId = ZoneId.of("Europe/Paris");
	    ZonedDateTime fusoId2 = ZonedDateTime.of(data, hora, fusoId);
	    System.out.println("Horário com fuso: "+fusoId2);
		*/
		
		 	Period of = Period.of(0, 0, 40);
		    System.out.println(of);

		    Period anos = Period.ofYears(10);
		    System.out.println(anos);
		    
		    LocalDate dataFabricacao = LocalDate.now();
		    
		    LocalDate dataValidade = dataFabricacao.plusDays(90);
		    
		    Period between = Period.between(dataFabricacao, dataValidade);
		    
		    System.out.println(dataValidade);
		    
		    System.out.println(between);
		    
		    
		    LocalDate dataNascimento = LocalDate.of(1987, Month.AUGUST, 11);
		    
		    LocalDate dataAtual = LocalDate.now();
		    
		    Period tempoDecorrido = Period.between(dataNascimento, dataAtual);
		    
		    System.out.println(tempoDecorrido);
		    
		    
		    LocalDate doeiSangue = LocalDate.of(2021, Month.SEPTEMBER, 24);
		    
		    LocalDate proximaDoacao = doeiSangue.plusMonths(2);
		    
		    System.out.println(proximaDoacao);
		    
	}

}
