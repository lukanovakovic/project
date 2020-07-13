package staticChapter.z2StaticConverterTemperature;

public class StaticConvertorTemperature {

	static double konvertujCUF(double tempC) {
		return (tempC * 9.0) / 5 + 32;
	}

	static double konvertujFUC(double tempF) {
		return (tempF - 32) * (5 / 9);
	}

}
