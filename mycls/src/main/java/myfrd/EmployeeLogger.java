package myfrd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeLogger {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeLogger.class);

    public static void logEmployeeDetails(Employee employee) {
        logger.info("Logging Employee Details: " + employee);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "John Doe", 50000);
        logEmployeeDetails(emp1);
    }
}