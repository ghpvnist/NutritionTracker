import java.io.Serializable;
import java.util.HashMap;

public class Tracker implements Serializable {
    private HashMap<String, Data> dataList;

    public Tracker() {
        this(new HashMap<String, Data>());
    }

    public Tracker(HashMap<String, Data> tracker) {
        this.dataList = tracker;
    }

    public HashMap<String, Data> getDataList() {
        return dataList;
    }


}
