package hw8;


public class Manager extends BaseEmployee implements IManager{

    private final int numberOfSubordinates;
    private static final double COEFFICIENT = 0.03;

    public Manager(String name, int age, char gender, int numberOfSubordinates) {
        super(name, age, gender);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {

            return Math.round(getBaseSalary() + (getBaseSalary() * (getNumberOfSubordinates() * COEFFICIENT)));
        } else {

            return getBaseSalary();
        }
    }

    @Override
    public String toString() {
        return "Manager {" +
                "name: " + super.getName() +
                ", salary: " + getSalary() +
                ", numberOfSubordinates: " + numberOfSubordinates +
                '}';
    }
}
