package hu.home.employee.db;

import hu.home.employee.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Employee> employees = new ArrayList<Employee>();

    public Database(){
        employees.add(new Employee(1,"John", "New York" , 25));
        employees.add(new Employee(2,"Jack", "Cincinatty" , 26));
        employees.add(new Employee(3,"Jil", "Tenessy" , 27));
        employees.add(new Employee(4,"Mike", "Detroit" , 28));
        employees.add(new Employee(5,"Barbara", "Atlantic City" , 29));
        employees.add(new Employee(6,"Wick","Honolulu",30));
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }

    public Employee findEmployee(String name){
        Employee result = employees.stream().filter(empl->name.equals(empl.getName())).findAny().orElse(null);
        return result;
    }

}
