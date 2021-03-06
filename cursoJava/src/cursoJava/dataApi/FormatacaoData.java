package cursoJava.dataApi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class FormatacaoData {

	public static void main(String[] args) {

	    // DateTimeFormatter
	    DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
	    
	    DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    
	    DateTimeFormatter formato = 
		        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
	    
	    ZonedDateTime zdtNow = ZonedDateTime.now();
	    LocalDateTime ldtNow = LocalDateTime.now();
	    	    
	    String formatacao = dt.format(ldtNow);
	    	    
	    String format = formato.format(zdtNow);
	    
	    //System.out.println(zdtNow);
	    //System.out.println(formatacao);
	    System.out.println(format);
	    
	    DateTimeFormatter formatter2 = 
	        DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
	    
	    String format2 = formatter2.format(ldtNow);
	    System.out.println(format2);
	    
	    String format3 = ldtNow.format(formatter2);
	    System.out.println(format3);
	    
	    TemporalAccessor parse = formatter2.parse("29-07-2019 11-39-47");
	    System.out.println(parse);
	    //LocalDateTime from = LocalDateTime.from(parse);
	   // System.out.println(from);
	    
	    
	    DateTimeFormatter formatterHora = 
	        DateTimeFormatter.ofPattern("HH-mm-ss");
	    TemporalAccessor parse2 = formatterHora.parse("08-11-34");
	    System.out.println(parse2);
	    //LocalTime from2 = LocalTime.from(parse2);
	   // System.out.println(from2);
	   // LocalDateTime.from(parse2);

	}

}
