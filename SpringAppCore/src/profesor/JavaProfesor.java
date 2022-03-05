package profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaProfesor implements Profesor{
	
	@Value("Perica")
	private String ime;
	
	private Predmet predmet;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	@Autowired
	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	@Override
	public void pozdrav() {
		System.out.println("Pozdrav od profesora " + getIme());
	}

	@Override
	public void getPredmetKojiPredajem() {
		predmet.dajMiPredmet();	// od reference Predmet predmet, poziva metodu dajMiPredmet() iz klase Predmet
		
	}

}
