package corejava;

import java.util.Scanner;

public class Billingapp {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------------------Akkii Car Services Center----------------");
            System.out.println("1.  Add Customer");
            System.out.println("2.  Display Invoice");
            System.out.println("3.  Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name");
                    String name = sc.next();
                    System.out.println("Enter Phone Number");
                    String phone = sc.next();
                    System.out.println("Enter the Car Number ");
                    String carNumber = sc.next();
                    System.out.println("Enter the Car Model");
                    String model = sc.next();
                    garageService.addCustomer(name, phone, carNumber, model);
                    break;
                case 2:
                    System.out.println("Enter Car Number");
                    String carNo = sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting.... thank you");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice ");


            }
        }
    }
}
