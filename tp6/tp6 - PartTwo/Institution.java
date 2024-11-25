public class Institution {
    public int id;
    private String Type;
    private String Address;
    private String Phone_Number;
    private String Logo_Url;
    public Department[] Departments;

    public Institution(int id, String Type, String Address, String Phone_Number, String Logo_Url) {
        this.id = id;
        this.Type = Type;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Logo_Url = Logo_Url;
    }

    public void graduateStudent() {
        System.out.println("a student graduated, yay...");
    }

    public void print_institution_infos() {
        System.out.println("////////////// Institution Info");
        System.out.println(id);
        System.out.println(Type);
        System.out.println(Address);
        System.out.println(Phone_Number);
        System.out.println(Logo_Url);
    }

    // getters
    public int getId() {
        return id;
    }

    public String getType() {
        return Type;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getLogo_Url() {
        return Logo_Url;
    }

    public Department[] getDepartments() {
        return Departments;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public void setLogo_Url(String logo_Url) {
        Logo_Url = logo_Url;
    }

    public void setDepartments(Department[] departments) {
        Departments = departments;
    }
}