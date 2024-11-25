package Classes;

public class Accessoire extends Materials {
    public Accessoire(String registration_number, String date_installation, String productName) {
        super(registration_number, date_installation, productName ,"Accessoire");
    }

    public void print_materials_info() {
        System.out.println("this is a accessoire with the date_installation: " + date_installation);
    }
}
