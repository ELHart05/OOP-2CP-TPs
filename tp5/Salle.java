class Salle {
    public int id;
    public String salle_name;
    public String accessoire;
    public String location;

    public Salle(int id, String salle_name, String accessoire, String location) {
        this.id = id;
        this.salle_name = salle_name;
        this.accessoire = accessoire;
        this.location = location;
    }

    public void printSalleInfos() {
        System.out.println("this is a salle with id: " + id);
    }
}