package constructors.z1ZdravstvenaUstanova;

public class ZdravstvenaUstanova {

	private String naziv;
	private String adresa;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public ZdravstvenaUstanova() {
		naziv = "nepoznato";
		adresa = "nepoznato";
	}

	public ZdravstvenaUstanova(String nazivUstanove) {
		naziv = nazivUstanove;
	}

	public ZdravstvenaUstanova(String nazivUstanove, String adresaUstanove) {
		naziv = nazivUstanove;
		adresa = adresaUstanove;
	}

	public void ispis() {
		System.out.println("naziv ustanove je " + naziv + " adresa ustanove je " + adresa);
	}

}
