class Material {
    public int id;
    public String registration_number;
    public String date_installation;
    public String State;

    public Material(int id, String registration_number, String date_installation, String State) {
        this.id = id;
        this.registration_number = registration_number;
        this.date_installation = date_installation;
        this.State = State;
    }

    public void print_materials_infos() {
        System.out.println("this is a material with id: " + id);
    };
}