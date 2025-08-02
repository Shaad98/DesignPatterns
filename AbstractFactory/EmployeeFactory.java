public class EmployeeFactory {
    public static Employee createEmployee(EmployeeAbstractFactory employeeAbstractFactory)
    {
        return employeeAbstractFactory.createEmployee();
    }
}
