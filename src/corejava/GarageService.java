package corejava;

import java.awt.image.ImageProducer;
import java.util.*;

public class GarageService {
    private Map<String, Customer> customersmap;
    private List<Service> availableService;

    public GarageService() {
        this.customersmap = new HashMap<>();
        this.availableService = new ArrayList<>();
        loadServices();

    }
    public void loadServices(){
        availableService.add(new Service("Car Wash",500));
        availableService.add(new Service("Oil Change",700));
        availableService.add(new Service("Wheel alignment", 300));
        availableService.add(new Service("Tyre replacement",3000));
        availableService.add(new Service("Puncture",100));
        availableService.add(new Service("Rear mirror",1000));

    }
     public void addCustomer(String name,String phone,String carNumber,String model){
        Car car=new Car(carNumber,model);
        Customer customer=new Customer(name,phone,car);
        customersmap.put(carNumber,customer);
         System.out.println("Customer added successfully");

     }
public void createInvoice(String carNumber){
        if(!customersmap.containsKey(carNumber)){
            System.out.println("no Customer found with car number: "+carNumber);
            return ;
          }
        Scanner sc=new Scanner(System.in);
        Customer customer=customersmap.get(carNumber);

        Invoice invoice=new Invoice(customer);

        System.out.println("Available Services: ");
        for(int i=0;i<availableService.size();i++){
            System.out.println((i+1)+". "+availableService.get(i).getName()+" - ₹"+availableService.get(i).getPrice());

        }
        while(true) {
            System.out.println("Enter Service number to add from 1 to last or for not servicing enter zero(0)");
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice > 0 && choice <= availableService.size()) {
                invoice.addService(availableService.get(choice - 1));
                System.out.println("Service done");

            } else {
                System.out.println("Invalid choice");

            }

        }
        invoice.printInvoice();


}

}
