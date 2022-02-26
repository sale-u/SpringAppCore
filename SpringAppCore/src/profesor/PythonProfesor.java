package profesor;

public class PythonProfesor implements Profesor {
	
	private Predmet predmet;

	public PythonProfesor(Predmet predmet) {
		super();
		this.predmet = predmet;
	}

	@Override
	public void pozdrav() {
		System.out.println("Pozdrav od profesora Pythona");
	}

	@Override
	public void getPredmetKojiPredajem() {
		predmet.dajMiPredmet("Python");
		
	}

}
