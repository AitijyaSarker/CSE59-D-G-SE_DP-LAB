interface BonusEligible {
    void calculateBonus();
}

class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Employee extends TeamMember implements BonusEligible {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}

class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }

    public void submitInvoice() {
        System.out.println("Submitting contractor invoice...");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Rahim");
        employee.displayInfo();
        employee.calculateBonus();

        System.out.println();

        Contractor contractor = new Contractor("Karim");
        contractor.displayInfo();
        contractor.submitInvoice();
    }
}
