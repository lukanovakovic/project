package methods.z8automobil;

public class TroskoviRegitstacije {

	static int obracunajDoprinos(Automobil auto) {

		if (auto.getKubikaza() > 400 && auto.getKubikaza() < 1000) {
			if (auto.getKubikaza() < 1000)
				return 145;
			else if (auto.getKubikaza() >= 1000 && auto.getKubikaza() < 1400)
				return 200;

		} else {
			System.out.println("kubikaza nije u granicama dozvoljenog");
			return 0;
		}

	}

}
