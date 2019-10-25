package pl.altkom.collections.zad02;

import pl.altkom.collections.Employee;

import java.util.List;

public class Updater {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();

        for (Employee emp : employees){
            emp.setSalary(emp.getSalary()*1.1);
        }
        //employees.replaceAll(emp -> emp.setSalary(emp.getSalary()*1.1));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
