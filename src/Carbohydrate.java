import java.io.Serializable;

public class Carbohydrate implements Serializable {
	private Fiber fiber;
	private Sugar sugar;

	public Carbohydrate() {
		this.fiber = new Fiber();
		this.sugar = new Sugar();
	}

	public Carbohydrate(Fiber fiber, Sugar sugar) {
		this.fiber = fiber;
		this.sugar = sugar;
	}

	public Fiber getFiber() {
		return fiber;
	}

	public void setFiber(Fiber fiber) {
		this.fiber = fiber;
	}

	public Sugar getSugar() {
		return sugar;
	}

	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}

	public String toString() {
		String s = "";
		s += "\t\t\tFiber: \n\t" + fiber + "\n";
		s += "\t\t\tSugar: \n\t" + sugar;
		return s;
	}
}
