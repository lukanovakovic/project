package aggregationAssociationComposition.z1FormulaTim;

public class Osoba {

	private String ime;
	private String prezime;

	public Osoba() {
	}

	public Osoba(String ime, String prezime) {

		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void ispis() {

		System.out.println("ime = " + ime + " prezime = " + prezime);
	}

}
