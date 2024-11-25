package Classes;

public class Department {
    public int id;
    public String DepartmentName;
    public String Code;
    public String HeadName;
    public String Email_Address;
    public Block[] Blocks;

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

    public void setBlocks(Block[] blocks) {
        Blocks = blocks;
    }

}
