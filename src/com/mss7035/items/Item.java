package Testing.items;

import java.util.UUID;

public abstract class Item {
    private final String ID;
    private String name;
    private String creator;
    private double value;
    private double weight;
    private boolean isStolen;

    public Item() {
        this.ID = UUID.randomUUID().toString();
    }
    public String getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public String getCreator() {
        return creator;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setStolen() {
        this.isStolen = true;
    }
    public void setNotStolen() {
        this.isStolen = false;
    }
    public boolean getStolen() {
        return isStolen;
    }
}
