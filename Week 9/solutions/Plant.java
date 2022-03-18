public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String toString() {
        return "Plant Name: " + name;
    }

    public boolean equals(Object o) {
        if (o instanceof Plant) {
            Plant otherPlant = (Plant) o;
            return otherPlant.name.equals(this.name);
        }
        return false;
    }
}