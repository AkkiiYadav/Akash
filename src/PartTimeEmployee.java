public class PartTimeEmployee extends Employee{

    private double hourWorked;
    private double hourRated;
    PartTimeEmployee(String name, int id,double hourWorked,double hourRated) {

        super(name, id);
        this.hourRated=hourRated;
        this.hourWorked=hourWorked;
    }

    @Override
    public double calculateSalary() {
        return hourWorked*hourRated;
    }
}
