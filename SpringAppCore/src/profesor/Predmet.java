package profesor;

public class Predmet {
	
	private String nazivPredmeta;
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
