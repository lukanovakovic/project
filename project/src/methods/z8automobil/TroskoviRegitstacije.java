package methods.z8automobil;

public class TroskoviRegitstacije {

	static double obracunajDoprinos(Automobil auto) {

		if (auto.getKubikaza() > 400 && auto.getKubikaza() < 1000) {
			if (auto.getKubikaza() < 1000)
				return 145.5;
			else if (auto.getKubikaza() >= 1000 && auto.getKubikaza() < 1400)
				return 200.0;
			else if (auto.getKubikaza() >= 1400 && auto.getKubikaza() < 2500)
				return 250.0;
			else {
				return 413.3;
			}

		} else {
			System.out.println("Pokusaj novog brancha");
			System.out.println("kubikaza nije u granicama dozvoljenog");
			return 0;
		}
	}

	static double obracunajOsiguranje(Automobil auto) {

		if (auto.getSnaga() > 20 && auto.getSnaga() < 1000) {
			if (auto.getSnaga() < 55)
				return 3000.0;
			else if (auto.getSnaga() >= 55 && auto.getSnaga() < 75)
				return 4500.0;
			else if (auto.getSnaga() >= 75 && auto.getSnaga() < 150)
				return 7300.0;
			else {
				return 9000.0;
			}

		} else {
			System.out.println("snaga nije u granicama dozvoljenog");
			return 0;
		}

	}
}
