package utils;

import employees.IEmployee;
import employees.IManager;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {

    public static List<IEmployee> findByName(IEmployee[] employeeArray, String name) {
        List<IEmployee> employees = new ArrayList<>();
        if (employeeArray != null && employeeArray.length > 0) {

            for (IEmployee employee : employeeArray) {
                if (employee.getName().equals(name)) {
                    employees.add(employee);
                }
            }
        }

        return employees;
    }

    public static List<IEmployee> findByPartOfTheName(IEmployee[] employeeArray, String partOfTheName) {
        List<IEmployee> employees = new ArrayList<>();
        if (employeeArray != null && employeeArray.length > 0) {
            for (IEmployee employee : employeeArray) {
                if (employee.getName().toLowerCase().contains(partOfTheName.toLowerCase())) {
                    employees.add(employee);
                }
            }
        }
        return employees;
    }

    public static double getSmallestSalary(IEmployee[] employeeArray) {
        double minSalary = Double.MAX_VALUE;
        if (employeeArray != null && employeeArray.length > 0) {
            for (IEmployee employee : employeeArray) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
            }
        }

        return minSalary;
    }

    public static double getLargestSalary(IEmployee[] employeeArray) {
        double maxSalary = Double.MIN_VALUE;
        if (employeeArray != null && employeeArray.length > 0) {
            for (IEmployee employee : employeeArray) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }

        return maxSalary;
    }

    public static List<IEmployee> getEmployeeMinSalary(IEmployee[] employeeArray) {
        List<IEmployee> employees = new ArrayList<>();
        if (employeeArray != null && employeeArray.length > 0) {
            for (IEmployee employee : employeeArray) {
                if (employee.getSalary() == getSmallestSalary(employeeArray)) {
                    employees.add(employee);
                }
            }
        }

        return employees;
    }

    public static int minNumberOfSubordinates(IManager[] managerArr) {
        int minNumberOfSubordinates = Integer.MAX_VALUE;
        if (managerArr == null || managerArr.length < 1) {

            return -1;
        }
        for (IManager manager : managerArr) {
            if (manager.getNumberOfSubordinates() < minNumberOfSubordinates) {
                minNumberOfSubordinates = manager.getNumberOfSubordinates();
            }
        }

        return minNumberOfSubordinates;
    }

    public static int maxNumberOfSubordinates(IManager[] managerArr) {
        int maxNumberOfSubordinates = Integer.MIN_VALUE;
        if (managerArr != null && managerArr.length > 0) {
            for (IManager manager : managerArr) {
                if (manager.getNumberOfSubordinates() > maxNumberOfSubordinates) {
                    maxNumberOfSubordinates = manager.getNumberOfSubordinates();
                }
            }

        }

        return maxNumberOfSubordinates;
    }

    public static double bonusToSalary(IManager employee) {

        return employee.getSalary() - employee.getBaseSalary();
    }

    public static double maxBonusToSalary(IManager[] managerArr) {
        double maxBonus = Double.MIN_VALUE;
        if (managerArr != null && managerArr.length > 0) {
            for (IManager manager : managerArr) {
                if ((bonusToSalary(manager) > maxBonus)) {
                    maxBonus = bonusToSalary(manager);
                }
            }
        }

        return maxBonus;
    }

    public static double minBonusToSalary(IManager[] managerArr) {
        double minBonus = Double.MAX_VALUE;
        if (managerArr != null && managerArr.length > 0) {
            for (IManager manager : managerArr) {
                if ((bonusToSalary(manager) < minBonus)) {
                    minBonus = bonusToSalary(manager);
                }
            }
        }

        return minBonus;
    }

    public static double getSumSalary(IEmployee[] employeeArray) {
        double sum = 0;
        if (employeeArray != null && employeeArray.length > 0) {
            for (IEmployee employee : employeeArray) {
                sum += employee.getSalary();
            }
        }

        return sum;
    }
}