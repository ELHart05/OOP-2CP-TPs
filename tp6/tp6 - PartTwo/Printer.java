public class Printer extends Materials {
    private String brand_name;
    private int capacity;

    public Printer(int id, String registration_number, String date_installation, String brand_name, int capacity) {
        super(id, registration_number, date_installation);
        this.brand_name = brand_name;
        this.capacity = capacity;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void print_materials() {
        System.out.println("this is a printer with the id: " + id);
    }
}
