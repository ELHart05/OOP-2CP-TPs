public class Block {
    public String Block_name;
    public String Block_localisation;
    public String Walls_color;
    public Building[] Buildings;

    public Block(String Block_name, String Block_localisation, String Walls_color) {
        this.Block_name = Block_name;
        this.Block_localisation = Block_localisation;
        this.Walls_color = Walls_color;
    }

    public void setBuildings(Building[] buildings) {
        Buildings = buildings;
    }

    public Building[] getBuildings() {
        return Buildings;
    }
}