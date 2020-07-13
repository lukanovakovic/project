package aggregationAssociationComposition.z1FormulaTim;

public class Formula1TimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Osoba o = new Osoba();
		o.setIme("milan");
		o.setPrezime("Plazinic");

		Formula1Tim tim1 = new Formula1Tim("firma", new Osoba("djordje", "djordjevice"), new Osoba("marko", "markovic"),
				new Osoba("petar", "petrovic"));
		tim1.naziv = "";
		tim1.setMenadzer(o);
		tim1.ispis();
	}

}
