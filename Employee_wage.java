//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Employee_wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage.");
        int Full_Time = 1;

        double emp_check = Math.floor(Math.random()*10 % 2);
        if(Full_Time == emp_check)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is not present");
    }
}