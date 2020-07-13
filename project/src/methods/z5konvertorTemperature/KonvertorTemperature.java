package methods.z5konvertorTemperature;

public class KonvertorTemperature {

	public double konvertujCUF(double temperaturaC) {

		return (temperaturaC * 9) / 5 + 32;

	}

	public double konvertujFUC(double temperaturaF) {

		return (temperaturaF - 32) * (5.0 / 9.0);

	}

}
