package utils;

import hw8.IEmployee;

public class SalaryUtils {

    public static int getSum(IEmployee[] employeeArray) {
        int sum = 0;
        for (IEmployee employee :employeeArray) {
           sum += employee.getSalary();
        }

      return sum;
    }
}
