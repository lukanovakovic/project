package methods.z4konvertorMetrickihJedinica;

public class KonvertorMetrickihJedinica {

	public double konvertujKilometreUMilje(Double kilometri) {
		kilometri = 4.0;
		return kilometri * 1.609;
	}

	public double konvertujKilometreUMilje(Test test) {
		test.setKm(4.0);
		return test.getKm() * 1.609;
	}

	public double konvertujMiljeUKilometre(double milje) {

		return milje / 1.609;
	}

	public double konvertujStopeUSantrimetre(double stope) {

		return stope * 30.48;
	}

	public double konvertujSantimetreUStope(double cm) {

		return cm / 30.48;
	}

}
