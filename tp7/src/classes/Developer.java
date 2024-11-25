package classes;

import abstractclasses.Employee;
import interfaces.Manager;

public class Developer extends Employee implements Manager {
    private int experience;

    public Developer(String name, int age, int employeeId, double salary, int experience) {
        super(name, age, employeeId, salary);
        setExperience(experience);
    }

    @Override
    public double calculateBonus() {
        return salary * (experience * 0.01);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void approveLeave(String employeeName) {
        System.out.println("leave approved for employee " + employeeName);
    }
}
