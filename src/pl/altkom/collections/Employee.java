package pl.altkom.collections;

import java.util.Arrays;
import java.util.List;

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

    public static List<Employee> createEmployees() {
        return Arrays.asList(
                new Employee("Paweł", "Bogdan", 3000),
                new Employee("Adam", "Mickiewicz", 5000),
                new Employee("Juliusz", "Słowacki", 6000),
                new Employee("Adam", "Mickiewicz", 5000),
                new Employee("Jan", "Kowalski", 2000),
                new Employee("Anna", "Nowak", 4000),
                new Employee("Maria", "Konopnicka", 6500),
                new Employee("Eliza", "Orzeszkowa", 2500),
                new Employee("Emilia", "Plater", 2220)
        );
    }
}
