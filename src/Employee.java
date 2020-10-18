import java.util.Locale;
import java.util.Scanner;

public class Employee {
    private String name;
    private String lastName;
    private double salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int setupCountOfEmployees() {
        boolean status = false;
        int countOfUsers = 0;
        System.out.print("Podaj liczbę pracowników do uzupełnienia. Wartość całkowitą pomiędzy 2 a 5: ");
        Scanner scanner = new Scanner(System.in);
        while (!status) {
            countOfUsers = scanner.nextInt();
            if (countOfUsers >= 2 && countOfUsers <= 5) {
                status = true;
            } else {
                System.out.print("Podana wartość jest poza zadanego zakresu. Popraw wartość całkowitą pomiędzy 2 a 5: ");
            }
        }
        return countOfUsers;
    }

    public void inputEmployees(Employee[] employees) {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu wynagrodzenia!");
        while (index < employees.length) {
            employees[index] = new Employee();
            System.out.printf("Podaj dane dla pracownika %d/%d:\n", (index + 1), employees.length);
            System.out.print("Podaj imię: ");
            employees[index].setName(scanner.next());
            System.out.print("Podaj nazwisko: ");
            employees[index].setLastName(scanner.next());
            System.out.print("Podaj wynagrodzenie: ");
            employees[index].setSalary(scanner.nextDouble());
            index++;

        }
    }

    public void inputOneEmployee(Employee emp) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu wynagrodzenia!");
        //employees[index] = new Employee();
        System.out.println("Podaj dane dla pracownika.");
        System.out.print("Podaj imię: ");
        emp.setName(scanner.next());
        System.out.print("Podaj nazwisko: ");
        emp.setLastName(scanner.next());
        System.out.print("Podaj wynagrodzenie: ");
        emp.setSalary(scanner.nextDouble());
    }

    public double totalSalaries(Employee[] employees) {
        int index = 0;
        double totalSalaries = 0;
        while (index < employees.length) {
            totalSalaries += employees[index].getSalary();
            index++;
        }
        return totalSalaries;
    }

}
