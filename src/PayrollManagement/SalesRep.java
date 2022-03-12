package PayrollManagement;

public class SalesRep extends StaffMember{
    private double allowance;

    public SalesRep ()
    {

    }

    public SalesRep (String fName, String lName, String dNum, double hWork, double a)
    {
        super(fName, lName, dNum, hWork);
        this.allowance = a;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void display() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Department Identification Number: " + getDeptNumber());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Allowance: " + getAllowance());
        System.out.println("Salary: " + calculateSalary());

    }

    @Override
    public double calculateSalary(){
        double salary;
        salary = (getHoursWorked() * 1500) + getAllowance();
        return salary;
    }
}
