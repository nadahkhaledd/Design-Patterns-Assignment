package model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String department;
    private String position;
    private List<Employee> team;

    public Employee(String name, String department, String role) {
        this.name = name;
        this.department = department;
        this.position = role;
        this.team = new ArrayList<>();
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void addEmployee(Employee employee){
        team.add(employee);
    }

    public void removeEmployee(Employee employee){
        team.remove(employee);
    }

    @Override
    public String toString() {
        return String.format("\tName: %s\t\tPosition: %s\t\tDepartment: %s", this.name, this.position, this.department);
    }
}
