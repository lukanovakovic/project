package methods.z3kalkulator;

public class ProveraKalkulatora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kalkulator kalkulator = new Kalkulator();

		System.out.println(kalkulator.saberi(10, 20));
		System.out.println(kalkulator.oduzmi(20, 10));
		System.out.println(kalkulator.pomnozi(10, 20));
		System.out.println(kalkulator.pomnozi(20.1, 10.0));
		System.out.println(kalkulator.podeliRealne(20.0, 10.0));
		System.out.println(kalkulator.podeliDIV(20, 10));
		System.out.println(kalkulator.podeliMOD(34, 6));

	}

}
