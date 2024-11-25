import java.util.ArrayList;


class TP_Salle extends Salle {
    public Boolean isActive;
    public ArrayList<Material> materials;

    public TP_Salle(int id, String salle_name, String accessoire, String location,
            Boolean isActive) {
        super(id, salle_name, accessoire, location);
        this.isActive = isActive;
        this.materials = new ArrayList<Material>();
    }

    public void print_salleTP_infos() {
        System.out.println("////////////// salle tp info");
        System.out.println("this is salle tp with id: " + id);
        for (Material material : materials) {
            if (material instanceof Datashow) {
                System.out.println("this is datashow with regestration number of: " + material.registration_number);
            } else if (material instanceof PC) {
                System.out.println("this is PC with regestration number of: " + material.registration_number);
            } else {
                System.out.println("this is a material with regestration number of: " + material.registration_number);
            }
        }
        System.out.println("/////////////////////");
    }

    public void add_materials_to_TPSalle(Material material) {
        this.materials.add(material);
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }
}