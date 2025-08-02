public class Main{
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.createEmployee(new WebDevFactory());
        System.out.println(employee.getType());
        System.out.println(employee.getSalary());

        Employee employee2 =  EmployeeFactory.createEmployee(new AndroidDevFactory());
        System.out.println(employee2.getType());
        System.out.println(employee2.getSalary());
    }
}