package Classes;

public abstract class Materials {
    public String registration_number;
    public String date_installation;
    public String productName;
    public String Type;

    public Materials(String registration_number, String date_installation, String productName, String Type) {
        this.registration_number = registration_number;
        this.date_installation = date_installation;
        this.productName = productName;
        this.Type = Type;
    }

    public abstract void print_materials_info();
}