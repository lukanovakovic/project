package methods.z7KlimaUredjaj2;

public class klimaUredjaj2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KlimaUredjaj2 klima = new KlimaUredjaj2();
		klima.podesiRezim('G');
		klima.povecajTemperaturu();
		klima.ispis();
		klima.smanjiTemperaturu();
		klima.ispis();
		klima.podesiTemperaturu(29);
		klima.ispis();

	}

}
