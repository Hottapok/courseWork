public class Employee {
    private String familyName;
    private String name;
    private String secondName;
    private int department;
    private int salary;
    private final int id;
    private static int counter = 1;


    public Employee(String familyName, String name, String secondName, int department, int salary) {
        this.familyName = familyName;
        this.name = name;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return familyName + " " + name + " " +  secondName + " " +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id
                ;
    }
}
