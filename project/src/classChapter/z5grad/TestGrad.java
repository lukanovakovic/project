package classChapter.z5grad;

public class TestGrad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grad grad1 = new Grad();
		Grad grad2 = new Grad();
		Grad grad3 = new Grad();

		grad1.setNaziv("beograd");
		grad2.setNaziv("njujork");
		grad3.setNaziv("vankuver");

		grad1.setBrojStanovnika(18000000);
		grad2.setBrojStanovnika(20000000);
		grad3.setBrojStanovnika(null);

		System.out.print("naziv " + grad1.getNaziv() + " broj stanovnika " + grad1.getBrojStanovnika() + "\n");
		System.out.print("naziv " + grad2.getNaziv() + " broj stanovnika " + grad2.getBrojStanovnika() + "\n");
		System.out.print("naziv " + grad3.getNaziv() + " broj stanovnika " + grad3.getBrojStanovnika());
	}

}
