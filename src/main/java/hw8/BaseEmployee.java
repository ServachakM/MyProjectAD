package hw8;


public abstract class BaseEmployee {

    private final double BASE_SALARY = 3000;
    private String name;
    private int age;
    private char gender;


    public BaseEmployee(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBaseSalary() {
        return this.BASE_SALARY;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSalary();


    @Override
    public String toString() {
        return "Employee {" +
                "name: " + name +
                ", age: " + age +
                ", gender: " + gender +
                ", baseSalary: " + BASE_SALARY +
                " }";
    }
}
