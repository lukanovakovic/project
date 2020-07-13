package methods.z6konvertorValute;

public class TestKonvertorValute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KonvertorValute konvertor = new KonvertorValute();

		konvertor.postaviKursDolara(60.34);
		konvertor.postaviKursEvra(76.89);

		konvertor.ispisiKursnuListu();

		System.out.println(konvertor.konverturjDolareUDinare(60));
		System.out.println(konvertor.konvertujEvreUDinare(45));
		System.out.println(konvertor.konvertujDinareUDolare(6034));
		System.out.println(konvertor.konvertujDinareUEvre(150));

	}

}
