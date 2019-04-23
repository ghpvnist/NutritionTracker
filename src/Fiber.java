import java.io.Serializable;

public class Fiber implements Serializable {
	private int gramsOfFiber;

	public Fiber() {
		this.gramsOfFiber = 0;
	}

	public Fiber(int gramsOfFiber) {
		this.gramsOfFiber = gramsOfFiber;
	}

	public int getGramsOfFiber() {
		return gramsOfFiber;
	}

	public void setGramsOfFiber(int gramsOfFiber) {
		this.gramsOfFiber = gramsOfFiber;
	}

	public String toString() {
		String s = "";
		s += "\t\t\tGrams of fiber: " + gramsOfFiber + " g";
		return s;
	}
}
