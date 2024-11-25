package Classes;

public class Datashow extends Materials {

    public Datashow(String brand_name, String registration_number, String date_installation, String productName) {
        super(registration_number, date_installation,productName, "Datashow");
    }
    
    public void print_materials_info() {
        System.out.println("this is a datashow with the date_installation: " + date_installation);
    }
}
