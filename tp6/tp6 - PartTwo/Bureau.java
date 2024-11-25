public class Bureau extends Building {
    public String bureau_name;
    public Materials[] materials;

    public Bureau(int building_id, String building_name, double building_area, int Capacity, String bureau_name) {
        super(building_id, building_name, building_area, Capacity);
        this.bureau_name = bureau_name;
    }

    public void print_bureau_infos() {
        System.out.println("this is bureau with id: " + building_id);
    }

    public void setMaterials(Materials[] materials) {
        this.materials = materials;
    }

    public Materials[] getMaterials() {
        return materials;
    }

    public void occupation() {
        System.out.println("Burea used to share knowledge in");
    }
}
