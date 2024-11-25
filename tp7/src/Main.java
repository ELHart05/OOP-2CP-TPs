import classes.Developer;
import classes.SalesPerson;
import classes.Tester;

public class Main {
    public static void main(String[] args) throws Exception {
        SalesPerson salesPerson = new SalesPerson("Amine", 30, 101, 5000.0, 10000.0);
        salesPerson.calculateBonus();
        salesPerson.approveLeave(null);
        Developer dev = new Developer("ou", 20, 52, 200, 10);
        Tester tester = new Tester("ou2", 20, "ddd");
    }
}