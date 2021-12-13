package truckable;

import java.util.ArrayList;
import java.util.List;

public class License {
    private final String type;
    private final String name;

    private List<ObtainingData> obtainingDataList;

    public License(String type, String name){
        this.type = type;
        this.name = name;
        obtainingDataList = new ArrayList<>();
    }

    public void addObtainingData(ObtainingData obtainingData) {
        this.obtainingDataList.add(obtainingData);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
