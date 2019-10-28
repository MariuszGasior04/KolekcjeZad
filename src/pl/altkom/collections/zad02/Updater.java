package pl.altkom.collections.zad02;

import pl.altkom.collections.Employee;

import java.util.List;
import java.util.function.UnaryOperator;

public class Updater {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();

        UnaryOperator<Employee> unaryOperator = emp -> {
             emp.setSalary(emp.getSalary() * 1.1);
            return emp;
        };

        employees.replaceAll(unaryOperator);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
    }

