package Classes;

import java.util.ArrayList;

public class TP_Salle {
    public String tablesNumber;
    public int buildingsNumber;
    public String buildingName;
    public double buildingArea;
    public int Capacity;
    public ArrayList<Materials> materials;

    public TP_Salle(String tablesNumber, int buildingsNumber, String buildingName, double buildingArea, int Capacity) {
        this.tablesNumber = tablesNumber;
        this.buildingsNumber = buildingsNumber;
        this.buildingName = buildingName;
        this.buildingArea = buildingArea;
        this.Capacity = Capacity;
        this.materials = new ArrayList<>();
    }

    public void print_salleTP_infos() {
        System.out.println("this is salle tp with number of tables: " + tablesNumber);
    }

    public void setMaterials(ArrayList<Materials> materials) {
        this.materials = materials;
    }

    public ArrayList<Materials> getTpMaterials() {
        return materials;
    }
    
    public void add_material_to_TPSalle(Materials material) {
        this.materials.add(material);
    }

    public void occupation() {
        System.out.println("Salle tp used to share knowledge in");
    }
}
