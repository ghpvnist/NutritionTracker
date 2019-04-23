import java.io.Serializable;

public class Cholesterol implements Serializable {
	private int milligramsOfCholesterol;

	public Cholesterol() {
		this.milligramsOfCholesterol = 0;
	}

	public Cholesterol(int milligramsOfCholesterol) {
		this.milligramsOfCholesterol = milligramsOfCholesterol;
	}

	public double getMilligramsOfCholesterol() {
		return milligramsOfCholesterol;
	}

	public void setMilligramsOfCholesterol(int milligramsOfCholesterol) {
		this.milligramsOfCholesterol = milligramsOfCholesterol;
	}

	public String toString() {
		String s = "" + milligramsOfCholesterol;
		return s;
	}


}
