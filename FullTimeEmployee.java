package session11_gioi1;

public class FullTimeEmployee extends Employee implements BonusEligible {
      private double baseSalary;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }


    @Override
    public double calculateBonus() {
        return baseSalary * 0.1;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
