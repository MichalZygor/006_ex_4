public class Company {
    private Employee[] employees;
    private Employee employeesApi;

    public Company() {
        employeesApi = new Employee();
        this.employees = new Employee[employeesApi.setupCountOfEmployees()];
//        this.employees = employees;
    }

    public void add(Employee emp){
        for(int index = 0; index < employees.length; index++){
            //System.out.println(employees.length);
            if( !(employees[index] instanceof Object)){
                System.out.println("Dane dla pracownika " + (index+1));
                employeesApi.inputOneEmployee(emp);

                break;
            }else{
                System.out.println("Nie mozna już dopisac wiecej pracowników.");
            }
        }
    }

    public Employee get(int index){
        if (index < employees.length && index >= 0){
            return employees[index];
        } else {
            System.out.println("Wskazany index jest poza zakresem");
            return null;
        }
    }

    public Employee getEmployeesApi() {
        return employeesApi;
    }
}
