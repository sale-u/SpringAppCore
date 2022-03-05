package profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("profaPython")
@Scope("singleton")
public class PythonProfesor implements Profesor {
	
	@Value("Pera")
	private String ime;
	private Predmet predmet;

	@Autowired
	public PythonProfesor(Predmet predmet) {		// konstruktor
		this.predmet = predmet;
	}
//	public PythonProfesor(String ime, Predmet predmet) {		// konstruktor
//		this.ime = ime;
//		this.predmet = predmet;
//	}
	
	public String getIme() {
		return ime;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	@Override
	public void pozdrav() {
		System.out.println("Pozdrav od profesora " + getIme());
	}

	@Override
	public void getPredmetKojiPredajem() {
		predmet.dajMiPredmet();
		
	}
	
	@PostConstruct
	public void initMetoda() {
		System.out.println("Preuzmi jezik...");
	}
	
	@PreDestroy
	public void destroyMetoda() {
		System.out.println("Zatvaram sve konekcije...");
	}

}
