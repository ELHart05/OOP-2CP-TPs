package classes;

import abstractclasses.Employee;
import interfaces.Manager;

public class SalesPerson extends Employee implements Manager {
    private double salesAmount;

    public SalesPerson(String name, int age, int employeeId, double salary, double salesAmount) {
        super(name, age, employeeId, salary);
        setSalesAmount(salesAmount);
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public void approveLeave(String employeeName) {
        System.out.println("leave approved for employee "+employeeName);
    }

    @Override
    public double calculateBonus() {
        return salesAmount*0.1;
    }

}
