import java.io.Serializable;

public class Sugar implements Serializable {
	private int gramsOfSugar;

	public Sugar() {
		this.gramsOfSugar = 0;
	}

	public Sugar(int gramsOfSugar) {
		this.gramsOfSugar = gramsOfSugar;
	}

	public int getGramsOfSugar() {
		return gramsOfSugar;
	}

	public void setGramsOfSugar(int gramsOfSugar) {
		this.gramsOfSugar = gramsOfSugar;
	}

	public String toString() {
		String s = "";
		s += "\t\t\tGrams of sugar: " + gramsOfSugar + " g";
		return s;
	}
}
