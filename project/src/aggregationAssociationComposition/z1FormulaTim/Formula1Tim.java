package aggregationAssociationComposition.z1FormulaTim;

public class Formula1Tim {

	String naziv;
	Osoba menadzer;
	Osoba prviVozac;
	Osoba drugiVozac;

	public Formula1Tim(String naziv, Osoba menadzer, Osoba prviVozac, Osoba drugiVozac) {
		super();
		this.naziv = naziv;
		this.menadzer = menadzer;
		this.prviVozac = prviVozac;
		this.drugiVozac = drugiVozac;
	}

	public void ispis() {
		System.out.println(naziv + " ");
		menadzer.ispis();
		prviVozac.ispis();
		drugiVozac.ispis();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Osoba getMenadzer() {
		return menadzer;
	}

	public void setMenadzer(Osoba menadzer) {
		this.menadzer = menadzer;
	}

	public Osoba getPrviVozac() {
		return prviVozac;
	}

	public void setPrviVozac(Osoba prviVozac) {
		this.prviVozac = prviVozac;
	}

	public Osoba getDrugiVozac() {
		return drugiVozac;
	}

	public void setDrugiVozac(Osoba drugiVozac) {
		this.drugiVozac = drugiVozac;
	}

}
