public class TP_Salle extends Salle {
    public Boolean isActive;
    public Materials[] materials;

    public TP_Salle(int building_id, String building_name, double building_area, int Capacity, String accessoire,
            Boolean isActive) {
        super(building_id, building_name, building_area, Capacity, accessoire);
        this.isActive = isActive;
    }

    public void print_salleTP_infos() {
        System.out.println("this is salle tp with id: " + building_id);
    }

    public void setMaterials(Materials[] materials) {
        this.materials = materials;
    }

    public Materials[] getMaterials() {
        return materials;
    }

    public void occupation() {
        System.out.println("Salle tp used to share knowledge in");
    }
}
