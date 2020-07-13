package aggregationAssociationComposition.z4BMIKalkulator;

public class BMIKalkulator {

	private String kategorija;
	private double BMI;

	public double izracunajBMI(double visina, double tezina) {
		if (visina < 1.2 || visina > 2.4 || tezina < 30 || tezina > 200) {
			System.out.println("nije u granicama");
			return 0;
		}

		double bmi = tezina / (visina * visina);
		return bmi;
//		if (tezina > 30 && tezina < 200 && visina < 2.4 && visina > 1.2) {
//			if (tezina / (visina * visina) <= 15) {
//				kategorija = "anoreksija";
//			} else if (tezina / (visina * visina) > 15 && tezina / (visina * visina) < 18.5) {
//				kategorija = "mrsavost";
//			} else if (tezina / (visina * visina) > 18.5 && tezina / (visina * visina) < 25) {
//				kategorija = "normalno";
//			} else if (tezina / (visina * visina) > 25 && tezina / (visina * visina) < 30) {
//				kategorija = "popunjen";
//			} else if (tezina / (visina * visina) > 30 && tezina / (visina * visina) < 40) {
//				kategorija = "debeo";
//			} else if (tezina / (visina * visina) < 40) {
//				kategorija = "gojazan";
//			}
//			BMI = tezina / (visina * visina);
//			return BMI;
//		} else {
//			System.out.println("nije u granicama");
//			return 0;
//
//		}
	}

	public void ispis() {
		System.out.println("kategorija = " + kategorija + " BMI  =  " + BMI);

	}
}
