package truckable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class License {
    private final String type;
    private final String name;

    private final List<ObtainingData> obtainingDataList;

    public License(String type, String name) {
        this.type = type;
        this.name = name;
        obtainingDataList = new ArrayList<>();
    }

    public void addObtainingData(ObtainingData obtainingData) {
        this.obtainingDataList.add(obtainingData);
    }

    public void removeObtainingData(ObtainingData obtainingData) {
        this.obtainingDataList.remove(obtainingData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        License license = (License) o;
        return type.equals(license.type) && name.equals(license.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }

    /**
     * GETTERS
     */
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public List<ObtainingData> getObtainingDataList() {
        return obtainingDataList;
    }
}
