public class Employee {
    private final int id;
    double salary;
    private String firstName;
    private String lastName;
    private final String middleName;
    int department;
    static int size;

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id работника=" + id + " " + " отдел " + department + " Ф.И.О." + lastName + " " + firstName + " " + middleName + " Зарплата " + salary;
    }

    //    public Employee() {
//        this.employees = new Employee[10];
//
//    }
//    public void addEmployee(int department, String firstName, String lastName, String middleName, double salary) {
//        if (size >= employees.length) {
//            System.out.println("Employee book is full. Adding a new employee is restricted.");
//        }
//        Employee newEmployee = new Employee(department, firstName, lastName, middleName, salary);
//        employees[size++] = newEmployee;
//    }
    public Employee(int department, String firstName, String lastName, String middleName, double salary) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        id = ++size;
    }

    public static void printAllEmployees() {

    }

    public int getId() {
        return id;

    }

    public int getCurrentSize() {
        return size;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public Employee[] getEmployees() {
//        return employees;
//    }

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
