import java.io.Serializable;

public class Nutrition implements Serializable {
	private int calorie;
	private double servingSize;
	private Fat fat;
	private Cholesterol cholesterol;
	private Sodium sodium;
	private Carbohydrate carbohydrate;
	private Protein protein;

	public Nutrition() {
		this.calorie = 0;
		this.servingSize = 0.0;
		this.fat = new Fat();
		this.cholesterol = new Cholesterol();
		this.sodium = new Sodium();
		this.carbohydrate = new Carbohydrate();
		this.protein = new Protein();
	}

	public Nutrition(int calorie, double servingSize, Fat fat, Cholesterol cholesterol, Sodium sodium, Carbohydrate carbohydrate, Protein protein) {
		this.calorie = calorie;
		this.servingSize = servingSize;
		this.fat = fat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
		this.protein = protein;
	}

	public double calculateTotalCalories(int calorie, double servingSize) {
		return calorie * servingSize;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public double getServingSize() {
		return servingSize;
	}

	public void setServingSize(double servingSize) {
		this.servingSize = servingSize;
	}

	public Fat getFat() {
		return fat;
	}

	public void setFat(Fat fat) {
		this.fat = fat;
	}

	public Cholesterol getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Cholesterol cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Sodium getSodium() {
		return sodium;
	}

	public void setSodium(Sodium sodium) {
		this.sodium = sodium;
	}

	public Carbohydrate getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Carbohydrate carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Protein getProtein() {
		return protein;
	}

	public void setProtein(Protein protein) {
		this.protein = protein;
	}

	public String toString() {
		String s = "";
		s += "\t\tCalorie: " + calorie + " cal\n";
		s += "\t\tServing size: " + servingSize + "\n";
		s += "\t\tFat: \n" + fat + "\n";
		s += "\t\tCholesterol: " + cholesterol + " mg\n";
		s += "\t\tSodium: " + sodium + " mg\n";
		s += "\t\tCarbohydrate: \n" + carbohydrate + "\n";
		s += "\t\tProtein: " + protein + " g";
		return s;
	}
}
