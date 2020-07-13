package methods.z1radio;

public class Radio {

	private double fmFrekvencija = 87.5;
	private int amFrekvencija = 567;
	private char band = 'F';

	public void podesiFmFrekvenciju(double novaFrekvencija) {
		this.fmFrekvencija = novaFrekvencija;

	}

	public void podesiAmFrekvenciju(int novaFrekvencija) {
		amFrekvencija = novaFrekvencija;

	}

	public double vratiFmFrekvenciju() {

		return fmFrekvencija;
	}

	public int vratiAmFrekvenciju() {

		return amFrekvencija;
	}

	public void promeniBandNaAm() {
		band = 'A';
	}

	public void promeniBandNaFm() {
		band = 'F';
	}

	public char vratiBand() {
		return band;
	}

	public void ispis() {
		System.out.println(
				"FM frekvencija je= " + fmFrekvencija + " AM frekvencija je= " + amFrekvencija + " band je " + band);
	}

}
