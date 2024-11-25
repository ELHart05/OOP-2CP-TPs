package Classes;

import java.util.ArrayList;

public class Block {
    public String Block_name;
    public String Block_localisation;
    public String Walls_color;
    public ArrayList<Building> Buildings;
    public ArrayList<TP_Salle> Tp_Salles;


    public Block(String Block_name, String Block_localisation, String Walls_color) {
        this.Block_name = Block_name;
        this.Block_localisation = Block_localisation;
        this.Walls_color = Walls_color;
        this.Buildings = new ArrayList<>();
        this.Tp_Salles = new ArrayList<>();

    }

    public void setBuildings(ArrayList<Building> buildings) {
        Buildings = buildings;
    }
    
    public void add_Building_to_Block(Building building) {
        this.Buildings.add(building);
    }

    public ArrayList<Building> getBuildings() {
        return Buildings;
    }
    
    public void setTPSalles(ArrayList<TP_Salle> tpsalles) {
        Tp_Salles = tpsalles;
    }
    
    public void add_TPSalle_to_Block(TP_Salle tpsalle) {
        this.Tp_Salles.add(tpsalle);
    }

    public ArrayList<TP_Salle> getTPSalles() {
        return Tp_Salles;
    }
}