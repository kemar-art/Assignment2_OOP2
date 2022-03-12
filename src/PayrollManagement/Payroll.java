package PayrollManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        List<SalesRep>sReps = new ArrayList<SalesRep>();
        //objects for 5 sales reps
        SalesRep sp1 = new SalesRep("Kemar","Norton", "B34",160,2000);
        SalesRep sp2 = new SalesRep("Toni Ann","wallace", "B35",160,2000);
        SalesRep sp3 = new SalesRep("Meleisa","Pinnock", "B36",160,2000);
        SalesRep sp4 = new SalesRep("Stephen","Baker", "B34",160,2000);
        SalesRep sp5 = new SalesRep("Jason","Stephenson", "B35",160,2000);
        //Adding objects to list
        sReps.add(sp1);
        sReps.add(sp2);
        sReps.add(sp3);
        sReps.add(sp4);
        sReps.add(sp5);



        //Polymorphism
        Manager management = new Manager("Han", "Solo", "B65", 160,6000);
        SalesRep sRep = new SalesRep("Simoy", "Walters", "B35", 160,2000);


        //Calculate and Display Salary for Sales Rep and Manager
        sRep.setHoursWorked(160); sRep.setAllowance(3000);
        management.setHoursWorked(160); management.setBonus(6000);



        do {
                System.out.println("\nSelect the option you want to print out");
                System.out.println("1: To Print the names of five Employees");
                System.out.println("2: To Print Info for the salesRep");
                System.out.println("3: To Print Info for the Manager");
                System.out.println("Enter 5 to exit at any time");

                switch (input(Integer.parseInt(reader.nextLine()))){
                    case 1:
                        System.out.println("Sales Representatives:\n");
                        for(SalesRep list : sReps){
                            System.out.println("Employee Name: " + list.getFirstName() + " " + list.lastName +
                                    "\nDepartment number: " + list.getDeptNumber() + "\n");
                        }
                        break;
                    case 2:
                        sRep.display();
                        System.out.println("Sales Representatives Standard Monthly Salary is $" + sRep.calculateSalary());
                        break;
                    case 3:
                        management.display();
                        System.out.println("Managers' Standard Monthly Salary is $" + management.calculateSalary());
                        break;
                    default: //System.out.println("You did not enter a valid input");
                }
               System.out.println("\nSelect the option you want to print out");
               System.out.println("1: To Print the names of five Employees");
               System.out.println("2: To Print Info for the salesRep");
               System.out.println("3: To Print Info for the Manager");
               System.out.println("Enter 5 to exit at any time");

          }while (input(Integer.parseInt(reader.nextLine())) != 5);
    }

    private static int input(int parseInt) {
        return parseInt;
    }

}
