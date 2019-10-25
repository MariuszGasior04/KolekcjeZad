package pl.altkom.collections.zad02;

import pl.altkom.collections.Employee;

import java.util.List;

public class Updater {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który da każdemu pracownikowi 10% podwyżki
        // skorzystaj z funkcji replaceAll
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
