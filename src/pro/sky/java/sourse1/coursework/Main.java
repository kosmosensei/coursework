package pro.sky.java.sourse1.coursework;


import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees(employeeBook.getEmployee()); // Метод выводящий всех сотрудников.
        System.out.println("= = = = = = = = = = = =");
        System.out.println("Месячная выплата всем сотрудникам = " + employeeBook.payAllForMonth(employeeBook.getEmployee())); // Месячная выплата всем сотрудникам
        System.out.println("= = = = = = = = = = = =");
        employeeBook.minSalary(employeeBook.getEmployee());
        System.out.println("= = = = = = = = = = = =");
        employeeBook.maxSalary(employeeBook.getEmployee());
        System.out.println("= = = = = = = = = = = =");
        System.out.println("Среднее зарплат всех сотрудников = " + employeeBook.averagePayAllForMonth(employeeBook.getEmployee()));
        System.out.println("= = = = = = = = = = = =");
        employeeBook.nameEmployee(employeeBook.getEmployee());
    }
}