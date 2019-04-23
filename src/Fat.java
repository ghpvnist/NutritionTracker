import java.io.Serializable;

public class Fat implements Serializable {
	private int gramsOfFat;
	private double percentFat;

	public Fat() {
		this.gramsOfFat = 0;
		this.percentFat = 0.0;
	}

	public Fat(int gramsOfFat, double percentFat) {
		this.gramsOfFat = gramsOfFat;
		this.percentFat = percentFat;
	}

	public int getGramsOfFat() {
		return gramsOfFat;
	}

	public void setGramsOfFat(int gramsOfFat) {
		this.gramsOfFat = gramsOfFat;
	}

	public double getPercentFat() {
		return percentFat;
	}

	public void setPercentFat(double percentFat) {
		this.percentFat = percentFat;
	}

	public String toString() {
		String s = "";
		s += "\t\t\tGrams of fat: " + gramsOfFat + " g\n";
		s += "\t\t\tPercent fat: " + percentFat + " %";
		return s;
	}

}
