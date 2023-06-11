package hu.home.employee;

import hu.home.employee.db.Database;
import hu.home.employee.entity.Employee;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        for(Employee emp: db.getAllEmployees()){
            System.out.println(emp.toString());
        }
        System.out.println(db.findEmployee("Mike"));
        System.out.println(db.findEmployee("Barbara"));
        System.out.println(db.findEmployee("Jil"));
        System.out.println(db.findEmployee("Jack"));
        System.out.println(db.findEmployee("John"));
        System.out.println(db.findEmployee("Wick"));
        
    }
}
