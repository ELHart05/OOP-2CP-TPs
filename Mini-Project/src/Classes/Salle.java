package Classes;

public class Salle extends Building {
    public String accessoire;
    public Materials[] materials;

    public Salle(int building_id, String building_name, double building_area, int Capacity, String accessoire) {
        super(building_id, building_name, building_area, Capacity);
        this.accessoire = accessoire;
    }

    public void setMaterials(Materials[] materials) {
        this.materials = materials;
    }

    public Materials[] getMaterials() {
        return materials;
    }

    public void print_amphitheatre_infos() {
        System.out.println("this is salle with id: " + building_id);
    }

    public void occupation() {
        System.out.println("Salle used to share knowledge in");
    }
}
