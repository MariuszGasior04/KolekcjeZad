package pl.altkom.collections.zad03;

import pl.altkom.collections.Employee;

import java.util.List;
import java.util.function.Predicate;

public class Remover {

    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który usunie wszystkich pracowników,
        // którzy zarabiają więcej niż 5000
        // skorzystaj z funkcji removeIf
        Predicate<Employee> predicate = n -> (n.getSalary()>5000);
        employees.removeIf(predicate);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
