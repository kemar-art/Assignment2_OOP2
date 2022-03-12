package PayrollManagement;

public abstract class StaffMember {
    protected String firstName;
    protected String lastName;
    protected String deptNumber;
    protected double hoursWorked;

    public StaffMember(){

    }

    public StaffMember(String fName, String lName, String dNum, double hWork){
        this.firstName = fName;
        this.lastName = lName;
        this.deptNumber = dNum;
        this.hoursWorked = hWork;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void display(){
        System.out.println("Last Name: "+ getLastName());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Dept Number: " + getDeptNumber());
        System.out.println("Hours Worked: " + getHoursWorked());
    }

    abstract double calculateSalary();
}
