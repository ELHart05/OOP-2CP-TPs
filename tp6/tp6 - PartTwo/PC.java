public class PC extends Materials {
    private String CPU;
    private String ram;

    public PC(int id, String registration_number, String date_installation, String CPU, String ram) {
        super(id, registration_number, date_installation);
        this.CPU = CPU;
        this.ram = ram;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRam() {
        return ram;
    }

    public void print_materials() {
        System.out.println("this is a pc with the id: " + id);
    }
}
