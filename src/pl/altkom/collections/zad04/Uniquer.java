package pl.altkom.collections.zad04;

import pl.altkom.collections.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Uniquer {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który usunie pracowników, którzy się powtarzają

        TreeSet<Employee> set = new TreeSet<Employee>();
        set.addAll(employees);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
