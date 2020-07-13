package methods.z4konvertorMetrickihJedinica;

import java.time.LocalDate;
import java.util.Date;

public class TestKonverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KonvertorMetrickihJedinica konverter = new KonvertorMetrickihJedinica();

		// PROSLEDJIVANJE PO VREDNOSTI
		Double param = 3.0;
		System.out.println(konverter.konvertujKilometreUMilje(param));
		System.out.println(param);

		String ime1 = new String("LUKA");
		String ime = "Luka";
		ime1 = "Milan";
		ime = "Milan";

		// PROSLEDJIVANJE PO REFERENCI
		Test t = new Test();
		t.setKm(3.0);
		System.out.println(konverter.konvertujKilometreUMilje(t));
		System.out.println("TEST km: " + t.getKm());

		System.out.println(konverter.konvertujMiljeUKilometre(1609));
		System.out.println(konverter.konvertujSantimetreUStope(30.48));
		System.out.println(konverter.konvertujStopeUSantrimetre(1));

		MyImmutableClass istance = new MyImmutableClass("Milan", LocalDate.of(1993, 01, 28), new Date(), 2);
		istance.getDate().setYear(1993);

	}

}
