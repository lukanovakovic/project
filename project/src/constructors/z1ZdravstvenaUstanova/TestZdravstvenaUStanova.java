package constructors.z1ZdravstvenaUstanova;

public class TestZdravstvenaUStanova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZdravstvenaUstanova zdravstvenaUstanova1 = new ZdravstvenaUstanova();
		ZdravstvenaUstanova zdravstvenaUstanova2 = new ZdravstvenaUstanova("Dom zdravlja Vozdovac");
		ZdravstvenaUstanova zdravstvenaUstanova3 = new ZdravstvenaUstanova("Reumatolski institut Beograd",
				"Resavska 67");
		ZdravstvenaUstanova zdravstvenaUstanova4 = new ZdravstvenaUstanova();

		zdravstvenaUstanova1.setNaziv("KCS");
		zdravstvenaUstanova1.setAdresa("Pasterova 2");

		zdravstvenaUstanova1.ispis();
		zdravstvenaUstanova2.ispis();
		zdravstvenaUstanova3.ispis();
		zdravstvenaUstanova4.ispis();
	}

}
