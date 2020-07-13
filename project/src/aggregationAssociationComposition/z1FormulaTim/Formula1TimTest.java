package aggregationAssociationComposition.z1FormulaTim;

public class Formula1TimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Formula1Tim tim1 = new Formula1Tim("firma", new Osoba("djordje", "djordjevice"), new Osoba("marko", "markovic"),
				new Osoba("petar", "petrovic"));
		tim1.ispis();
	}

}
