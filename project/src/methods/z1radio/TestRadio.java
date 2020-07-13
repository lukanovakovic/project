package methods.z1radio;

public class TestRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Radio testRadio1 = new Radio();
		Radio testRadio2 = new Radio();
		Radio testRadio3 = new Radio();

		testRadio1.promeniBandNaAm();
		testRadio1.podesiAmFrekvenciju(570);
		testRadio2.podesiFmFrekvenciju(87.9);
		testRadio3.podesiFmFrekvenciju(107.9);

		testRadio1.ispis();
		testRadio2.ispis();
		testRadio3.ispis();
	}

}
