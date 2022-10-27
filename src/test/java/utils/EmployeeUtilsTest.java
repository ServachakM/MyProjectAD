package utils;

import hw8.IEmployee;
import hw8.IManager;
import hw8.Manager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class EmployeeUtilsTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    Manager mark = new Manager("Mark", 54, 'M', 12);
    Manager oleg = new Manager("Oleg", 25, 'M', 15);
    Manager oleksiy = new Manager("Oleksiy", 19, 'M', 11);
    Manager olena = new Manager("Olena", 21, 'F', 14);
    Manager natalia = new Manager("Natalia", 36, 'F', 32);

    private final IEmployee[] EMPTY_ARRAY = new Manager[]{};
    private final IManager[] EMPTY_ARR = new Manager[]{};

    private final IEmployee[] EMPLOYEE_ARRAY = {mark, oleg, oleksiy, olena, natalia};
    private final IManager[] MANAGER_ARR = {oleg, oleksiy, olena, natalia, mark};

    @Test
    public void testFindByName() {
        final String name = "Oleg";
        List<IEmployee> expectedResult = List.of(oleg);

        Assert.assertEquals(EmployeeUtils.findByName(EMPLOYEE_ARRAY, name),
                expectedResult);
        Assert.assertEquals(EmployeeUtils.findByName(EMPTY_ARRAY, name),
                null);

    }

    @Test
    public void testFindByPartOfTheName() {

        final String partOfName = "Ole";
        List<IEmployee> expectedResult = List.of(oleg, oleksiy, olena);

        Assert.assertEquals(EmployeeUtils.findByPartOfTheName(EMPLOYEE_ARRAY, partOfName),
                expectedResult);
    }

    @Test
    public void testGetSmallestSalary() {

        final double salary = 3990.0;

        Assert.assertEquals(EmployeeUtils.getSmallestSalary(EMPLOYEE_ARRAY), salary);
        Assert.assertEquals(EmployeeUtils.getSmallestSalary(EMPTY_ARRAY), Double.MAX_VALUE);

    }

    @Test
    public void testGetLargestSalary() {

        final double salary = 5880.0;

        Assert.assertEquals(EmployeeUtils.getLargestSalary(EMPLOYEE_ARRAY), salary);
        Assert.assertEquals(EmployeeUtils.getLargestSalary(EMPTY_ARRAY), Double.MIN_VALUE);

    }

    @Test
    public void testGetEmployeeMinSalary() {
        List<IEmployee> expectedResult = List.of(oleksiy);

        Assert.assertEquals(EmployeeUtils.getEmployeeMinSalary(EMPLOYEE_ARRAY), expectedResult);
        Assert.assertEquals(EmployeeUtils.getEmployeeMinSalary(EMPTY_ARRAY), new ArrayList<>());
    }

    @Test
    public void testMinNumberOfSubordinates() {

        Assert.assertEquals(EmployeeUtils.minNumberOfSubordinates(MANAGER_ARR), 11);
        Assert.assertEquals(EmployeeUtils.minNumberOfSubordinates(EMPTY_ARR), -1);
    }

    @Test
    public void testMaxNumberOfSubordinates() {

        Assert.assertEquals(EmployeeUtils.maxNumberOfSubordinates(MANAGER_ARR), 32);
        Assert.assertEquals(EmployeeUtils.maxNumberOfSubordinates(EMPTY_ARR), Integer.MIN_VALUE);
    }

    @Test
    public void testMaxBonusToSalary() {
        final double bonus = 2880.0;

        Assert.assertEquals(EmployeeUtils.maxBonusToSalary(MANAGER_ARR), bonus);
        Assert.assertEquals(EmployeeUtils.maxBonusToSalary(EMPTY_ARR), Double.MIN_VALUE);
    }

    @Test
    public void testMinBonusToSalary() {
        final double bonus = 990.0;

        Assert.assertEquals(EmployeeUtils.minBonusToSalary(MANAGER_ARR), bonus);
        Assert.assertEquals(EmployeeUtils.minBonusToSalary(EMPTY_ARR), Double.MAX_VALUE);
    }
}