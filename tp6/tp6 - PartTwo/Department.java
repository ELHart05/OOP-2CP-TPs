public class Department {
    public int id;
    private String DepartmentName;
    private String Code;
    private String HeadName;
    private String Email_Address;
    public Block[] Blocks;
    public ServicePayment DeparmentSPayment;
    public ServiceRH DeparmentSRH;
    public ServiceTeaching DeparmentSTeaching;

    public Department(int id, String DepartmentName, String Code, String HeadName, String Email_Address) {
        this.id = id;
        this.DepartmentName = DepartmentName;
        this.Code = Code;
        this.HeadName = HeadName;
        this.Email_Address = Email_Address;
    }

    public void print_department_infos() {
        System.out.println("//////////////// Department Info");
        System.out.println(id);
        System.out.println(DepartmentName);
        System.out.println(Code);
        System.out.println(HeadName);
        System.out.println(Email_Address);
        System.out.println("////////////////");
    }

    public void getStudentList() {
        System.out.println("the list of students....");
    }

    public Block[] getBlocks() {
        return Blocks;
    }

    public ServicePayment getDeparmentSPayment() {
        return DeparmentSPayment;
    }

    public ServiceRH getDeparmentSRH() {
        return DeparmentSRH;
    }

    public ServiceTeaching getDeparmentSTeaching() {
        return DeparmentSTeaching;
    }

    public void setBlocks(Block[] blocks) {
        Blocks = blocks;
    }

    public void setDeparmentSPayment(ServicePayment deparmentSPayment) {
        DeparmentSPayment = deparmentSPayment;
    }

    public void setDeparmentSTeaching(ServiceTeaching deparmentSTeaching) {
        DeparmentSTeaching = deparmentSTeaching;
    }

    public void setDeparmentSRH(ServiceRH deparmentSRH) {
        DeparmentSRH = deparmentSRH;
    }

}
