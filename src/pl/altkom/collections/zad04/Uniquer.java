package pl.altkom.collections.zad04;

import pl.altkom.collections.Employee;

import java.util.HashSet;
import java.util.List;

public class Uniquer {
    public static void main(String[] args) {
        List<Employee> employees = Employee.createEmployees();
        // dodaj kod, który usunie pracowników, którzy się powtarzają

        for(Employee emp : employees){
            int counter = 0;
            int ind = 0;
            String fName = emp.getFirstName();
            String lName = emp.getLastName();
            double sal =emp.getSalary();
            for (Employee emp2: employees){
                String fName2 = emp2.getFirstName();
                String lName2 = emp2.getLastName();
                double sal2 =emp2.getSalary();
                if (fName==fName2 && lName == lName2 && sal==sal2){
                    counter++;
                }
            }
            if (counter ==2){
                employees.remove(ind);
            }
            ind++;
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
