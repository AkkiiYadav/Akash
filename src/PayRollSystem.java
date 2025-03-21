import java.util.ArrayList;

public class PayRollSystem {
    private ArrayList<Employee> employeelist;

    public PayRollSystem() {
        employeelist=new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeelist.add(employee);
    }
    public void removeEmployee(int id){
        for(Employee em:employeelist){
            if(em.getId()==id){
                employeelist.remove(em);
                break;
            }
        }
    }
    public void displayEmployees(){
        for(Employee em:employeelist){
            System.out.println(em);
        }
    }
}
