class Datashow extends Material {
    public String name;
    public String resolution;

    public Datashow(int id, String registration_number, String date_installation, String State, String name,
            String resolution) {
        super(id, registration_number, date_installation, State);
        this.name = name;
        this.resolution = resolution;
    }
}