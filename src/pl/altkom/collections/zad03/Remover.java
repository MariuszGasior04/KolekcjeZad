package pl.altkom.collections.zad03;

import pl.altkom.collections.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Test implements Predicate<Employee>{

    @Override
    public boolean test(Employee employee) {
        if (employee.getSalary()>5000) {
            return true;
        } else {
            return false;
        }
    }
}

public class Remover {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który usunie wszystkich pracowników,
        // którzy zarabiają więcej niż 5000
        // skorzystaj z funkcji removeIf

        employees.removeIf(new Test());

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
