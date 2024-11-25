package abstractclasses;

import classes.Person;

abstract public class Employee extends Person {

  private int employeeId;
  protected double salary;

  public Employee(String name, int age, int employeeId, double salary) {
      super(name, age);
      this.employeeId = employeeId;
      this.salary = salary;
  }

  public int getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
  }
   
  abstract public double calculateBonus();

}
