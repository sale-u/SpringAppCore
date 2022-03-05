package profesor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		// pravimo Bean factory koji ocitava konfig.file spring.xml u potrazi za Beanovima koje moze da isporuci
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Profesor profa = new JavaProfesor();
		
		// sad pravimo objekat putem poziva stat.metode getBean() nad context-om
		// gde navodimo ime Bean-a "profaJave" i ime interfejsa Profesor
//		Profesor profa1 = context.getBean("profaJave", Profesor.class);
//		profa1.pozdrav();
//		profa1.getPredmetKojiPredajem(); // ovo podrazumeva da je on automatski napravio novi Predmet objekat
//										// dodelio ga kao atribut u objektu JavaProfesor i onda prozvao metodu za prikaz
//
//		System.out.println();
//		Profesor profa2 = context.getBean("profaJave2", Profesor.class);
//		Profesor profaDrugi = context.getBean("profaJave2", Profesor.class);
//		profa2.pozdrav();
//		profa2.getPredmetKojiPredajem();
//		profaDrugi.pozdrav();
//		profaDrugi.getPredmetKojiPredajem();
//		System.out.println("Profa: " + profa2);			// vraca nam mem.lokaciju
//		System.out.println("Profa: " + profaDrugi);		// vraca nam istu mem.lokaciju jer je Bean profaJave2 Singleton scope
		
		Profesor profa1 = context.getBean("javaProfesor", Profesor.class);
		profa1.pozdrav();
		profa1.getPredmetKojiPredajem();
		
		System.out.println();
		Profesor profa3 = context.getBean("profaPython", Profesor.class);
		profa3.pozdrav();
		profa3.getPredmetKojiPredajem();
//		Profesor profa3Drugi = context.getBean("profaPython", Profesor.class);
//		profa3Drugi.pozdrav();
//		profa3Drugi.getPredmetKojiPredajem();
//		System.out.println("Profa Pythona : " + profa3);
//		System.out.println("Profa Pythona : " + profa3Drugi); //razlicita mem.adresa jer smo stavili scope Prototype
		
		
		context.close();


	}

}
