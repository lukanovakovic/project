package methods.z8automobil;

public class Automobil {

	private String model;
	private String marka;
	private int kubikaza;
	private int snaga;

	public Automobil(String model, String marka, int kubikaza, int snaga) {
		super();
		this.model = model;
		this.marka = marka;
		this.kubikaza = kubikaza;
		this.snaga = snaga;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

}
