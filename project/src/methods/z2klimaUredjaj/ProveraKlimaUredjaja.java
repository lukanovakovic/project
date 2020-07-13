package methods.z2klimaUredjaj;

public class ProveraKlimaUredjaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KlimaUredjaj klima1 = new KlimaUredjaj();
		KlimaUredjaj klima2 = new KlimaUredjaj();

		klima1.ukljuciRezimGrejanja();
		klima1.podesiTemp(28);
		klima2.ukljuciRezimHladjenja();
		klima1.podesiTemp(20);

		klima1.ispis();
		klima2.ispis();

	}

}
