package constructors.z2Proizvod;

public class Proizvod {

	private int sifra;
	private String naziv;

	public Proizvod(String naziv) {
		this.naziv = naziv;
	}

	public Proizvod(String naziv, int sifra) {
		this.naziv = naziv;
		this.sifra = sifra;
	}

	public void ispis() {
		sifra = 3;
		String jaje = "dafslda";
		System.out.println("sifra = " + sifra + " naziv = " + naziv);
	}
}
