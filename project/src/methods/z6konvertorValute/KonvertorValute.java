package methods.z6konvertorValute;

public class KonvertorValute {

	private double kursEvra;
	private double kursDolara;

	public void postaviKursEvra(double noviKurs) {
		kursEvra = noviKurs;

	}

	public void postaviKursDolara(double noviKurs) {
		kursDolara = noviKurs;

	}

	public double konvertujDinareUEvre(double dinari) {
		return dinari / kursEvra;
	}

	public double konvertujDinareUDolare(double dinari) {
		return dinari / kursDolara;
	}

	public double konvertujEvreUDinare(double dinari) {
		return dinari * kursEvra;
	}

	public double konverturjDolareUDinare(double dinari) {
		return dinari * kursDolara;

	}

	public void ispisiKursnuListu() {
		System.out.println("kurs evra= " + kursEvra + " kurs dolara= " + kursDolara);

	}
}
