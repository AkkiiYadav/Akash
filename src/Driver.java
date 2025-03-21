import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        PayRollSystem payRollSystem=new PayRollSystem();
        Scanner sc=new Scanner(System.in);
        FullTimeEmployee emp1;
        PartTimeEmployee emp2;

        String name;
        int id;
        double monthlySalary;
        double hourWorked;
        double hourRated;
        int choice=9;
        while(choice!=5){
            System.out.println();
            System.out.println("1. Add Full Time Employee");
            System.out.println("2. Add Part Time Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display Employee");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Employee Name");
                    name=sc.next();
                    System.out.println("Enter Employee id");
                    id=sc.nextInt();
                    System.out.println("Enter the monthly salary");
                    monthlySalary=sc.nextDouble();
                    emp1=new FullTimeEmployee(name,id,monthlySalary);
                    payRollSystem.addEmployee(emp1);
                    System.out.println("Employee Added successfully");
                    break;
                case 2:
                    System.out.println("Enter Employee Name");
                    name=sc.next();
                    System.out.println("Enter Employee id ");
                    id=sc.nextInt();
                    System.out.println("Enter Working Hour");
                    hourWorked=sc.nextDouble();
                    System.out.println("Enter Rate of Hour");
                    hourRated=sc.nextDouble();
                    emp2=new PartTimeEmployee(name,id,hourWorked,hourRated);
                    payRollSystem.addEmployee(emp2);
                    System.out.println("Employee Added successfully");
                    break;
                case 3:
                    System.out.println("Enter Employee id");
                    id=sc.nextInt();
                    payRollSystem.removeEmployee(id);
                    System.out.println("Removed Successfully");
                    break;
                case 4:
                    payRollSystem.displayEmployees();
                    break;
                case 5:
                    System.out.println("Thank you for Using");
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }

        }
    }
}
