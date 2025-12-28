package session11_gioi1;

public class Main {
    static void main() {
        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(1, "Nguyễn Văn A", 10_000_000);
        employees[1] = new PartTimeEmployee(2, "Nguyễn Văn B", 80);

        for(Employee e : employees){
            e.showInfo();
            System.out.println("Salary: "+ e.calculateSalary());

            if(e instanceof BonusEligible){
                BonusEligible b = (BonusEligible)e;
                System.out.println("Bonus: "+ b.calculateBonus());
            }
        }
    }
}
