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
        System.out.println(findingSalarySumOfAllEmployees());
        System.out.println("Минимальная зарплата "+findingMinSalary());
        System.out.println("Максимальная зарплата "+findingMaxSalary());
        System.out.println("Средняя зарплата "+findingAverageSalary());
        printingEmployeesFullName();
    }

    public static void printAllEmployeesInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int findingFirstElementOfArrayNotNull() {
        int firstElementId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                firstElementId = i;
                break;
            }
        }
        return firstElementId;
    }

    public static double findingSalarySumOfAllEmployees() {
        int i = findingFirstElementOfArrayNotNull();
        double salarySum = 0;
        for (; i < employees.length; i++) {
            if (employees[i] != null) {
                salarySum = salarySum + employees[i].getSalary();
            }
        }
        return salarySum;
    }

    public static double findingMinSalary() {
        int i = findingFirstElementOfArrayNotNull();
        double minSalary = employees[i].getSalary();

        for (; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary())
                    minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static double findingMaxSalary() {
        int i = findingFirstElementOfArrayNotNull();
        double maxSalary = employees[i].getSalary();
        for (; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary())
                    maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static double findingAverageSalary() {
        int currentNumberOfEmployees = 0;
        int i = findingFirstElementOfArrayNotNull();
        for (; i < employees.length; i++) {
            if (employees[i] != null) {
                currentNumberOfEmployees++;
            }
        }
        return findingSalarySumOfAllEmployees() / currentNumberOfEmployees;
    }

    public static void printingEmployeesFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }
}
