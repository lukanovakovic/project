package switchChapter.z1Sifrarnik;

public class Sifrarnik {

	static void ocenjivanje(int ocena) {

		if (ocena < 1 || ocena > 5) {
			System.out.println("nije u granicama ");
		} else {
			switch (ocena) {
			case 1: {
				System.out.println("nedovoljan");
				break;
			}
			case 2: {
				System.out.println("dovoljan");
				break;
			}

			case 3: {
				System.out.println("dobar");
				break;
			}
			case 4: {
				System.out.println("vrlo dobar");
				break;
			}
			case 5: {
				System.out.println("odlican");
				break;

			}

			}
		}
	}

	static String ocenjivanjeSaPovratkom(int ocena) {

		if (ocena < 1 || ocena > 5) {
			System.out.println("nije u granicama ");
			return "";
		}
		switch (ocena) {
		case 1: {
			return "nedovoljan";
		}
		case 2: {
			return "dovoljan";
		}

		case 3: {
			return "dobar";
		}
		case 4: {
			return "vrlo dobar";
		}
		case 5: {
			return "odlican";
		}
		default:
			System.out.println("nije u granicama");
			return "";
		}

	}

	static void proveraZnaka(char znak) {

		switch (znak) {

		case '.': {
			System.out.println("znak interpunkcije");
			break;
		}
		case '!': {
			System.out.println("znak interpunkcije");
			break;
		}
		case ',': {

			System.out.println("znak interpunkcije");
			break;
		}
		case ';': {
			System.out.println("znak interpunkcije");
			break;
		}
		case ':': {
			System.out.println("znak interpunkcije");
			break;
		}
		case '?': {
			System.out.println("znak interpunkcije");

			break;
		}
		case '1': {
			System.out.println("cifra");
			break;
		}
		case '2': {
			System.out.println("cifra");
			break;
		}
		case '3': {
			System.out.println("cifra");
			break;
		}
		case '4': {
			System.out.println("cifra");
			break;
		}
		case '5': {
			System.out.println("cifra");
			break;
		}
		case '6': {
			System.out.println("cifra");
			break;
		}
		case '7': {
			System.out.println("cifra");
			break;
		}
		case '8': {
			System.out.println("cifra");
			break;
		}
		case '9': {
			System.out.println("cifra");
			break;
		}
		case '0': {
			System.out.println("cifra");
			break;
		}

		}

	}
}
