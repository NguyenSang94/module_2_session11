package session11_gioi1;

public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Employee() {
    }

    public abstract double calculateSalary();

    void showInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
