package employees;

public class Accountant implements IEmployee{
    private final String name;
    private final double baseSalary = 4500;


    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.baseSalary * 1.2;
    }

    @Override
    public double getBaseSalary() {
        return this.baseSalary;
    }
}
