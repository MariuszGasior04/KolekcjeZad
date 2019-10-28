package pl.altkom.collections.zad04;

import pl.altkom.collections.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Uniquer {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który usunie pracowników, którzy się powtarzają
        Set<Employee> emp = new HashSet<>();

        for(Employee e:employees){
            emp.add(e);
        }

        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}
