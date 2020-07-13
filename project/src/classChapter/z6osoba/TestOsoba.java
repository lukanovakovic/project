package classChapter.z6osoba;

public class TestOsoba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Osoba osoba1 = new Osoba();
		Osoba osoba2 = new Osoba();

		osoba1.setImePrezime("Pera Peric");
		osoba2.setImePrezime("Marko Markovic");
		osoba1.setTezina(87.3);
		osoba2.setTezina(80.0);

		System.out.println(osoba1.getImePrezime() + " " + osoba1.getTezina());
		System.out.println(osoba1.getImePrezime() + " " + osoba1.getTezina());

		System.out.println("ime i prezime " + osoba1.getImePrezime() + " tezina: " + osoba1.getTezina());
		System.out.println("ime i prezime " + osoba2.getImePrezime() + " tezina: " + osoba2.getTezina());

	}

}
