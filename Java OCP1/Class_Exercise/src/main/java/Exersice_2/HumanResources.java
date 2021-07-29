/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exersice_2;

/**
 *
 * @author Jaco
 */
public class HumanResources  {
    private String name;
    private int age;
    private double salary;
    private int workingHours;
    private double overtimeRate;
 
    
    public void display(){
        System.out.println("What is your name: " + name);
        System.out.println("What is your age: " + age);
        System.out.println("What is HR salary: " + salary);
        System.out.println("What is your working hours: " + workingHours);
        System.out.println("What is the oveertime rate: " + overtimeRate);
        
    }
        
    public HumanResources(String name, int age, double salary, int workingHours,double overtimeRate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workingHours = workingHours;
        this.overtimeRate = overtimeRate;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
        
    }
    
