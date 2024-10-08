package com.solid;

public class SalaryCalculator {
   public double calculateSalary(Employee employee) {
          switch (employee.getRole()) {
              case "Manager":
                  return 10000;
              case "Developer":
                  return 8000;
              default:
                  return 5500;
          }
      }

}
