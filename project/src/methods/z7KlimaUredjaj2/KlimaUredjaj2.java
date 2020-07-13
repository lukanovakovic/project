package methods.z7KlimaUredjaj2;

public class KlimaUredjaj2 {

	private int trenutnaTemperatura = 18;
	private char rezimRada = 'A';

	public void smanjiTemperaturu() {

		if (trenutnaTemperatura > 18) {
			trenutnaTemperatura--;
		} else {
			System.out.println("nije moguce smanjiti");
		}

	}

	public void povecajTemperaturu() {

		if (trenutnaTemperatura < 30) {
			trenutnaTemperatura++;
		} else {
			System.out.println("nije moguce povecati");
		}

	}

	public void podesiTemperaturu(int temperaturu) {

		if (trenutnaTemperatura < 31 && trenutnaTemperatura > 17) {
			trenutnaTemperatura = temperaturu;
		} else {
			System.out.println("nije moguce podesiti na tu temperaturu");
		}

	}

	public void podesiRezim(char rezim) {

		if (rezim == 'A' || rezim == 'H' || rezim == 'G') {
			rezimRada = rezim;
		} else {
			System.out.println("buras rezim koji ne postoji");
		}

	}

	public void ispis() {
		System.out.println("rezim je = " + rezimRada + " trenutna temperatura je = " + trenutnaTemperatura);

	}
}
