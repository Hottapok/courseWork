import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 10000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 2, 12000);
        employees[2] = new Employee("Сидоров", "Сидр", "Иванович", 1, 11000);
        employees[3] = new Employee("Романов", "Александр", "Владимирович", 4, 14300);
        employees[4] = new Employee("Агафонов", "Андрей", "Андреевич", 3, 17000);
        employees[5] = new Employee("Хрюков", "Алексей", "Евгеньевич", 1, 9000);
        employees[6] = new Employee("Жуков", "Георгий", "Константинович", 5, 18000);
        employees[7] = new Employee("Малых", "Иван", "Петрович", 4, 10500);
        employees[8] = new Employee("Смелый", "Роман", "Иванович", 2, 12000);
        employees[9] = new Employee("Джугашвили", "Иосиф", "Виссарионович", 3, 20000);
        employeeData(employees);
        sumSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        middleSalary(employees);
        outData(employees);

    }

    public static void employeeData(Employee[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }
    }

    public static void sumSalary(Employee[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц :" + sum);
    }

    public static void minSalary(Employee[] data) {
        int count = 0;
        int minSalary = data[0].getSalary();
        for (int i = 1; i < data.length; i++) {
            if (data[i].getSalary() < minSalary) {
                count = i;
                minSalary = data[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + data[count].toString());
    }

    public static void maxSalary(Employee[] data) {
        int count = 0;
        int maxSalary = data[0].getSalary();
        for (int i = 1; i < data.length; i++) {
            if (data[i].getSalary() > maxSalary) {
                count = i;
                maxSalary = data[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой : " + data[count].toString());
    }

    public static void middleSalary(Employee[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i].getSalary();
        }
        int count = sum / data.length;
        System.out.println("Средняя зарплата :" + count);

    }

    public static void outData(Employee[] data) {
        System.out.println("Список сотрудников :");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getFamilyName()+" "+data[i].getName()+" "+data[i].getSecondName());
        }
    }


}