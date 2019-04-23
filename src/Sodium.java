import com.sun.prism.shader.Solid_RadialGradient_REFLECT_AlphaTest_Loader;

import java.io.Serializable;

public class Sodium implements Serializable {
	private int milligramsOfSodium;

	public Sodium() {
		this.milligramsOfSodium = 0;
	}

	public Sodium(int milligramsOfSodium) {
		this.milligramsOfSodium = milligramsOfSodium;
	}

	public int getMilligramsOfSodium() {
		return milligramsOfSodium;
	}

	public void setMilligramsOfSodium(int milligramsOfSodium) {
		this.milligramsOfSodium = milligramsOfSodium;
	}

	public String toString() {
		String s = "" + milligramsOfSodium;
		return s;
	}
}
