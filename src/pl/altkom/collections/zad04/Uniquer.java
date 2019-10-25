package pl.altkom.collections.zad04;

import pl.altkom.collections.Employee;

import java.util.List;

public class Uniquer {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który usunie pracowników, którzy się powtarzają
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
