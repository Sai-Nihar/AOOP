package com.solid;

public class Example {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
     Employee emp = new Employee("Sai", "Java Developer");
       SalaryCalculator calculator = new SalaryCalculator();
       double salary = calculator.calculateSalary(emp);
       System.out.println(emp.getName() + "'s Salary: $" + salary);

  }

}
