package model;

import java.util.ArrayList;
import java.util.List;

public class Types {
    private List<String> high = new ArrayList<>();
    private List<String> medium = new ArrayList<>();
    private List<String> low = new ArrayList<>();
    public List<String> getHigh() {
        return high;
    }

    public void setHigh(List<String> high) {
        this.high = high;
    }

    public List<String> getMedium() {
        return medium;
    }

    public void setMedium(List<String> medium) {
        this.medium = medium;
    }

    public List<String> getLow() {
        return low;
    }

    public void setLow(List<String> low) {
        this.low = low;
    }



    @Override
    public String toString() {
        return "{" +
                "HIGH=" + high +
                ", MEDUIM=" + medium +
                ", LOW=" + low +
                '}';
    }
}
