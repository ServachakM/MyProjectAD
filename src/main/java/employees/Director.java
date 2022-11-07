package employees;

public final class Director extends Manager{

    private static final double COEFFICIENT = 0.09;

    public Director(String name, int age, char gender, int numberOfSubordinates) {
        super(name, age, gender, numberOfSubordinates);
    }


    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {

            return Math.round(getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() * COEFFICIENT));
        } else {

            return getBaseSalary();
        }
    }

    @Override
    public String toString() {
        return "Director {" +
                "name: " + super.getName() +
                ", salary: " + getSalary() +
                ", numberOfSubordinates: " + getNumberOfSubordinates() +
                '}';
    }
}
