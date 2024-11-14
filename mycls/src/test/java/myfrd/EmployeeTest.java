package myfrd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testEmployeeCreation() {
        Employee emp = new Employee(1001, "John Doe", 50000.0);
        assertEquals(1001, emp.getId());
        assertEquals("John Doe", emp.getName());
        assertEquals(50000.0, emp.getSalary(), 0.01);
    }

    @Test
    public void testSetSalary() {
        Employee emp = new Employee(1002, "Jane Smith", 60000.0);
        emp.setSalary(65000.0);
        assertEquals(65000.0, emp.getSalary(), 0.01);
    }
}