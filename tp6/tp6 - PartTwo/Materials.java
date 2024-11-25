public abstract class Materials {
    public int id;
    public String registration_number;
    public String date_installation;

    public Materials(int id, String registration_number, String date_installation) {
        this.id = id;
        this.registration_number = registration_number;
        this.date_installation = date_installation;
    }

    public abstract void print_materials();
}