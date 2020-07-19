package methods.z8automobil;

public class TestKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobil auto = new Automobil("r8", "audi", 800, 900);

		TroskoviRegitstacije.obracunajOsiguranje(auto);
		TroskoviRegitstacije.obracunajDoprinos(auto);
		TroskoviRegitstacije.ispisiSveTroskove(auto);

	}

}
