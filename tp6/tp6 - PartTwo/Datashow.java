public class Datashow extends Materials {
    private String brand_name;

    public Datashow(int id, String registration_number, String date_installation, String brand_name) {
        super(id, registration_number, date_installation);
        this.brand_name = brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void print_materials() {
        System.out.println("this is a datashow with the id: " + id);
    }
}
