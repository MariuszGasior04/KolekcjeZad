package pl.altkom.collections.zad02;

import pl.altkom.collections.Employee;

import java.util.List;
import java.util.function.UnaryOperator;

class Raise implements UnaryOperator<Employee>{

    @Override
    public Employee apply(Employee employee) {
        employee.setSalary(employee.getSalary()*1.1);
        return employee;
    }
}

public class Updater {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
/*
        for (Employee emp : employees){
            emp.setSalary(emp.getSalary()*1.1);
        }
*/
        employees.replaceAll(new Raise());

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
