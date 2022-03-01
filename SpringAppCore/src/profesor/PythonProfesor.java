package profesor;

public class PythonProfesor implements Profesor {
	
	private String ime;
	private Predmet predmet;

	public PythonProfesor(String ime, Predmet predmet) {		// konstruktor
		this.ime = ime;
		this.predmet = predmet;
	}
	
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
	
	public void initMetoda() {
		System.out.println("Preuzmi jezik...");
	}
	
	public void destroyMetoda() {
		System.out.println("Zatvaram sve konekcije...");
	}

}
