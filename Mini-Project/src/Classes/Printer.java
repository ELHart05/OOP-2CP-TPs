package Classes;

public class Printer extends Materials {

    public Printer(String name, String registration_number, String date_installation, String productName) {
        super(registration_number, date_installation,productName, "Printer");
    }

    public void print_materials_info() {
        System.out.println("this is a printer with the date_installation: " + date_installation);
    }
}
