class PC extends Material {
    public String CPU;
    public String ram;

    public PC(int id, String registration_number, String date_installation, String State, String CPU, String ram) {
        super(id, registration_number, date_installation, State);
        this.CPU = CPU;
        this.ram = ram;
    }
}