import java.io.Serializable;

public class Protein implements Serializable {
	private int gramsOfProtein;

	public Protein() {
		this.gramsOfProtein = 0;
	}

	public Protein(int gramsOfProtein) {
		this.gramsOfProtein = gramsOfProtein;
	}

	public int getGramsOfProtein() {
		return gramsOfProtein;
	}

	public void setGramsOfProtein(int gramsOfProtein) {
		this.gramsOfProtein = gramsOfProtein;
	}

	public String toString() {
		String s = "" + gramsOfProtein;
		return s;
	}
}
