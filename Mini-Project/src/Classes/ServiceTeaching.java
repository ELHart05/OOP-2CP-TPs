package Classes;

public class ServiceTeaching implements ServiceI {
    private String Schedule;
    private String EntrolledStudents;
    private String StartDate;
    private String EndDate;

    public ServiceTeaching(String Schedule, String EntrolledStudents, String StartDate, String EndDate) {
        this.Schedule = Schedule;
        this.EntrolledStudents = EntrolledStudents;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    public void Feedback() {
        System.out.println("Teaching Service Feedback");
    }

    public String getSchedule() {
        return Schedule;
    }

    public String getEntrolledStudents() {
        return EntrolledStudents;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public void setEntrolledStudents(String entrolledStudents) {
        EntrolledStudents = entrolledStudents;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }
}
