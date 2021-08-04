package ex1;

import java.text.ParseException;
import java.time.LocalDate;

public class TestePessoa {

	public static void main(String[] args)  throws ParseException{
			
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setName("Laryssa");
		LocalDate birthDate = LocalDate.of(1995, 05, 18);
		pessoa1.setBirthDate(birthDate);
		pessoa1.setHeight(1.60);
		System.out.println("Sua idade é: " + pessoa1.calculateAge());
		
		pessoa1.info();
	}
}
