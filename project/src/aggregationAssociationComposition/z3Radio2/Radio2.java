package aggregationAssociationComposition.z3Radio2;

public class Radio2 {

	private double fmFrekvencija = 87.5;
	private int amFrekvencija = 567;
	private char band = 'F';

	public void podesiFmFrekvenciju(double novaFM) {
		if (novaFM > 87.5 && novaFM < 108.0)
			fmFrekvencija = novaFM;
		else
			System.out.println("mora biti izmedju 87.5 i 108.0");
	}

	public void podesiAmFrekvenciju(int novaAM) {
		if (novaAM >= 567 && novaAM <= 1576)
			amFrekvencija = novaAM;
		else
			System.out.println("mora biti izmedju 567 i 1576");
	}

	public void podesiBand(char noviBand) {
//		if (noviBand == 'A')
//			band = 'A';
//		else if (noviBand == 'F')
		if (noviBand == 'A' || noviBand == 'F')
			band = noviBand;
		else
			System.out.println("mora da bude A ili F");
	}

	public void ispis() {
		System.out.println("band = " + band + " AN je =  " + amFrekvencija + " fmFrekvencija " + fmFrekvencija);
	}

}
