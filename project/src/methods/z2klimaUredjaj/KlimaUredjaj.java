package methods.z2klimaUredjaj;

public class KlimaUredjaj {

	private int temperatura = 18;
	private char rezimRada = 'a';

	public void smanjiTemp() {
//		temperatura = temperatura - 1;
		temperatura--;
	}

	public void povecajTemp() {
//		temperatura = temperatura + 1;
		temperatura++;
	}

	public void podesiTemp(int novaTemperatura) {
		temperatura = novaTemperatura;
	}

	public void ukljuciRezimGrejanja() {
		rezimRada = 'g';
	}

	public void ukljuciRezimHladjenja() {
		rezimRada = 'h';
	}

	public void ukljuciRezimAutomatski() {
		rezimRada = 'a';
	}

	public void ispis() {
		System.out.println("temperatura= " + temperatura + " rezim rada je = " + rezimRada);
	}
}
