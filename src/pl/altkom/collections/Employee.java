package pl.altkom.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary);
    }

    public static List<Employee> createEmployees() {
        List<Employee> array = new ArrayList<>();
        array.add(new Employee("Paweł", "Bogdan", 3000));
        array.add(new Employee("Adam", "Mickiewicz", 5000));
        array.add(new Employee("Juliusz", "Słowacki", 6000));
        array.add(new Employee("Adam", "Mickiewicz", 5000));
        array.add(new Employee("Jan", "Kowalski", 2000));
        array.add(new Employee("Anna", "Nowak", 4000));
        array.add(new Employee("Maria", "Konopnicka", 6500));
        array.add(new Employee("Eliza", "Orzeszkowa", 2500));
        array.add(new Employee("Emilia", "Plater", 2220));
        return array;
    }
}
