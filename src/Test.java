public class Test {
    public static void main(String[] args) {
        Employee employeesApi = new Employee();
        Employee[] employees = new Employee[employeesApi.setupCountOfEmployees()];
        employeesApi.inputEmployees(employees);
        System.out.printf("Suma wypłat dla %d pracowników wynosi: %.2f\n", employees.length ,
                + employeesApi.totalSalaries(employees));
    }

}
