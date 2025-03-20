package corejava;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> servicelist;
    private double totalAmount;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.servicelist = new ArrayList<>();
        this.totalAmount = 0;
    }
    public void addService(Service service){
      servicelist.add(service);
      totalAmount+=service.getPrice();

    }
    public void printInvoice(){
        System.out.println("---------------Invoice---------------");
        System.out.println("Costumer: "+customer.getName()+" | Phone: "+customer.getPhone()+" | Car: "+customer.getCar().getModel()+" | Number: "+customer.getCar().getCarNumber());
        System.out.println("Services: ");
        for(Service service:servicelist){
            System.out.println("# "+service.getName()+": ₹ "+service.getPrice());
        }
        System.out.println("Total Amount: ₹"+totalAmount);
        System.out.println("-----------------Thank you---------------");
    }
}
