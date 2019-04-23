import java.io.Serializable;
import java.util.HashMap;

public class Data implements Serializable {

    private HashMap<String, Nutrition> foodList;

    public Data() {
        this(new HashMap<String, Nutrition>());
    }

    public Data(HashMap<String, Nutrition> foodList) {
        this.foodList = foodList;
    }

    public HashMap<String, Nutrition> getFoodList() {
        return foodList;
    }

    public String toString() {
        String s = "";
        for (String key: foodList.keySet()) {
            s += "\t" + key + " Nutrition Facts: \n" + foodList.get(key);
        }
        return s;
    }
}
