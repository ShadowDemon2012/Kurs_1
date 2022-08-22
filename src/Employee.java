public class Employee {
    private final int id;
    private double salary;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private int department;
    private static int counter;

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id работника=" + id + " " + " отдел " + department + " Ф.И.О." + lastName + " " + firstName + " " + middleName + " Зарплата " + salary;
    }

    public Employee(int department, String firstName, String lastName, String middleName, double salary) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        id = ++counter;
    }

    public static void printAllEmployees() {

    }

    public int getId() {
        return id;

    }

    public int getCurrentCounter() {
        return counter;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
