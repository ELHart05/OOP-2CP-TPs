package Classes;

public abstract class Building {
    public int building_id;
    protected String building_name;
    protected double building_area;
    protected int Capacity;

    public Building(int building_id, String building_name, double building_area, int Capacity) {
        this.building_id = building_id;
        this.building_name = building_name;
        this.building_area = building_area;
        this.Capacity = Capacity;
    }

    public abstract void occupation();
}