package profesor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Predmet {
	
	@Value("Python")
	private String nazivPredmeta;
	@Value("PY123")
	private String sifraPredmeta;

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	
	public String getSifraPredmeta() {
		return sifraPredmeta;
	}

	public void setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}

	public void dajMiPredmet() {
		System.out.println("Predmet koji predajem je : " + getNazivPredmeta() + " sa sifrom : " + getSifraPredmeta());
	}

}
