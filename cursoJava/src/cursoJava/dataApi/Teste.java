package cursoJava.dataApi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Teste {

	public static void main(String[] args) throws ParseException {
		Date data = new Date();
		
		System.out.println(data);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Data e Hora atual: "+c.getTime());
		
		Calendar c2 = Calendar.getInstance();

		System.out.println("Data/Hora atual: "+c2.getTime());
		System.out.println("Ano: "+c2.get(Calendar.YEAR));
		System.out.println("Mês: "+c2.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c2.get(Calendar.DAY_OF_MONTH));
		
		Calendar c3 = Calendar.getInstance();
		c3.set(Calendar.YEAR, 1984);
		c3.set(Calendar.MONTH, Calendar.JUNE);
		c3.set(Calendar.DAY_OF_MONTH, 13);

		System.out.println("Data/Hora atual: "+c3.getTime());
		System.out.println("Ano: "+c3.get(Calendar.YEAR));
		System.out.println("Mês: "+c3.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c3.get(Calendar.DAY_OF_MONTH));
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);

		if(hora > 6 && hora < 12){
			System.out.println("Bom Dia");
		}else if(hora > 12 && hora < 18){
			System.out.println("Boa Tarde");
		}else{
			System.out.println("Boa Noite");
		}
		
		Calendar c4 = Calendar.getInstance();
		Date data2 = c4.getTime();
		DateFormat f = DateFormat.getDateInstance();

		//Date data3 = f.parse("2009-06-24 10:56:00");
		Date data3 = new Date();
		System.out.println(data3);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+sdf.format(data2));

		//Converte Objetos
		System.out.println("Data convertida: "+sdf.parse("02/08/1970"));
		
		
	}
}
