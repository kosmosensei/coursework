package pro.sky.java.sourse1.coursework;

import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    static int counter = 1;
    private int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        if (department > 0 && department <= 5) {
            this.department = department;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "id(" + id + ')' +
                " ФИО: '" + fullName + '\'' +
                ", Департамент: " + department +
                ", Зарплата = " + salary;
    }
}


