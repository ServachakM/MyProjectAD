package hw8;

public final class Worker extends BaseEmployee implements IEmployee {

    public Worker(String name, int age, char gender) {
        super(name, age, gender);
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary();
    }


}
