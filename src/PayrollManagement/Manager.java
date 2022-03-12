package PayrollManagement;

public class Manager  extends StaffMember{
    private double bonus;
    private double salary;

   public Manager(String fName, String lName, String dptNumber, double hrsWorked, double b){
        super(fName,lName,dptNumber,hrsWorked);
        this.bonus =b;
    };
   public Manager(){}
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary()
    {
        salary = ((getHoursWorked() * 2500) + bonus);
        return salary;
    }


    public void display(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Department Identification Number: " + getDeptNumber());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Bonus: $" + getBonus());
        System.out.println("Salary: $" + calculateSalary());


    }
}
