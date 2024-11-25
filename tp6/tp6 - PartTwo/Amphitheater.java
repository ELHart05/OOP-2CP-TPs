public class Amphitheater extends Building {
    public Boolean Availability;
    public Materials[] materials;

    public Amphitheater(int building_id, String building_name, double building_area, int Capacity,
            Boolean Availability) {
        super(building_id, building_name, building_area, Capacity);
        this.Availability = Availability;
    }

    public void setMaterials(Materials[] materials) {
        this.materials = materials;
    }

    public Materials[] getMaterials() {
        return materials;
    }

    public void print_amphitheatre_infos() {
        System.out.println("this is amphi with id: " + building_id);
    }

    public void occupation() {
        System.out.println("Amphi used to share knowledge in");
    }
}
