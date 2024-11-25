package classes;

import interfaces.Manager;

public class Tester implements Manager {

    private String name;
    private int age;
    private String projet;

    public Tester(String name, int age, String projet) {
        this.name = name;
        this.age = age;
        this.projet = projet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }

    @Override
    public void approveLeave(String employeeName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'approveLeave'");
    }
}
