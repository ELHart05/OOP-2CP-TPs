public class Accessoire extends Materials {
    private String name;

    public Accessoire(int id, String registration_number, String date_installation, String name) {
        super(id, registration_number, date_installation);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print_materials() {
        System.out.println("this is a accessoire with the id: " + id);
    }
}
