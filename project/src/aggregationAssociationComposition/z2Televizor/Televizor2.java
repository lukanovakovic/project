package aggregationAssociationComposition.z2Televizor;

public class Televizor2 {

	private int jacinaTona = 0;
	private int trenutniProgram = 1;
	private boolean ukljucen = false;

	public void ukljuci() {
		if (!ukljucen)
			ukljucen = true;
		else
			System.out.print("televizor je vec ukljucen");
	}

	public void iskljuci() {
		if (ukljucen) {
			ukljucen = false;
		} else {
			System.out.print("televizor je vec iskljucen");
		}
	}

	public void pojacajTon() {
		if (jacinaTona < 10)
			jacinaTona++;
		else
			System.out.print("jacina tona je na maksimumu");

	}

	public void smanjiTon() {
		if (jacinaTona > 0)
			jacinaTona--;
		else
			System.out.print("jacina tona je na minimumu");

	}

	public void podesiProgramNavise() {
		if (trenutniProgram < 99)
			trenutniProgram++;
		else
			trenutniProgram = 1;
	}

	public void podesiProgramNanize() {
		if (trenutniProgram > 1)
			trenutniProgram--;
		else
			trenutniProgram = 99;
	}

	public void ispis() {

		System.out.println("jacina tona je = " + jacinaTona + " trenutni program je = " + trenutniProgram
				+ " televizor je = " + ukljucen);
	}
}
