public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[1] = new Employee(1, "Аббас", "Ваклиев", "Дмитриевич", 1555);
        employees[2] = new Employee(3, "Дмитрий", "Писк", "Дмитриевич", 25);
        employees[3] = new Employee(2, "Том", "Васильев", "Сергеевич", 16);
        employees[6] = new Employee(5, "Вася", "Васильев", "Дмитриевич", 16);
        employees[7] = new Employee(5, "Саша", "Стреев", "Михайлович", 15882);
        employees[8] = new Employee(4, "Дмитрий", "Васильев", "Александрович", 16);
        employees[9] = new Employee(2, "Антон", "Васильев", "Дмитриевич", 10);
        printAllEmployeesInfo();
        System.out.println(findingFirstElementOfArrayNotNull());
        System.out.println(findingSalaryOfAllEmployees());
        System.out.println(findingMinSalary());
        System.out.println(findingMaxSalary());
        System.out.println(findingAverageSalary());
        printingEmployeesFullName();
    }

    public static void printAllEmployeesInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double findingFirstElementOfArrayNotNull() {
        double firstElement = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                firstElement = employees[i].getSalary();
                break;
            }
        }
        return firstElement;
    }

    public static double findingSalaryOfAllEmployees() {
        double salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salarySum = salarySum + employees[i].getSalary();
            }
        }
        return salarySum;
    }

    public static double findingMinSalary() {
        double minSalary = findingFirstElementOfArrayNotNull();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary())
                    minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static double findingMaxSalary() {
        double maxSalary = findingFirstElementOfArrayNotNull();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary())
                    maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static double findingAverageSalary() {
        double salarySum = findingSalaryOfAllEmployees();
        int currentNumberOfEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                currentNumberOfEmployees++;
            }
        }
        double averageSalary = salarySum / currentNumberOfEmployees;
        return averageSalary;
    }

    public static void printingEmployeesFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }
}
