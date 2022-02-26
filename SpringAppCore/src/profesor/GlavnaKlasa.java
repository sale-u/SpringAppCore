package profesor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		// pravimo Bean factory koji ocitava konfig.file spring.xml u potrazi za Beanovima koje moze da isporuci
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Profesor profa = new JavaProfesor();
		
		// sad pravimo objekat putem poziva stat.metode getBean() nad context-om
		// gde navodimo ime Bean-a "profaJave" i ime Profesor interfejsa
		Profesor profa = context.getBean("profaJave", Profesor.class);
		profa.pozdrav();
		profa.getPredmetKojiPredajem(); // ovo podrazumeva da je on automatski napravio novi Predmet objekat
										// dodelio ga kao atribut u objektu JavaProfesor i onda prozvao metodu za prikaz

		
//		Profesor profa2 = context.getBean("profaPython", Profesor.class);
//		profa2.pozdrav();
//		profa2.getPredmetKojiPredajem();
		
		
		context.close();


	}

}
