
public class SaturatedFat extends Fat {
	private int gramsOfFat;
	private double percentFat;
	
	public SaturatedFat() {
		this.gramsOfFat = 0;
		this.percentFat = 0.0;
	}
	
	public SaturatedFat(int gramsOfFat, double percentFat) {
		super(gramsOfFat, percentFat);
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
	
	
}
