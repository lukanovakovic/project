package aggregationAssociationComposition.z1FormulaTim;

public class Formula1Tim {

	private String naziv;
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

}
