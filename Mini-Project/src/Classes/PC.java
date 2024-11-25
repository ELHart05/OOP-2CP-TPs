package Classes;

public class PC extends Materials {
    private String CPU;
    private String ram;

    public PC(String CPU, String ram, String registration_number, String date_installation, String productName) {
        super(registration_number, date_installation, productName, "PC");
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

    public void print_materials_info() {
        System.out.println("this is a pc with the date_installation: " + date_installation);
    }
}
