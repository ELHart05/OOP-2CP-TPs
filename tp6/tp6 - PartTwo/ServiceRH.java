public class ServiceRH implements ServiceI {
    public int EmployeeID;
    public String Skills;

    public ServiceRH(int EmployeeID, String Skills) {
        this.EmployeeID = EmployeeID;
        this.Skills = Skills;
    }

    public void Feedback() {
        System.out.println("RH Service Feedback");
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getSkills() {
        return Skills;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }
}
