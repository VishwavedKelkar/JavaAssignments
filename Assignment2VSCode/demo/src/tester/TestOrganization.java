package tester;
import java.util.*;

public class TestOrganization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int choice;
		int counter=0;
		String name;
		double basicSalary;
		double bonus;
		double hoursWorked;
		double hourlyRate;
		double netSalary;
		
		Employee e;
		ArrayList<Employee> list = new ArrayList<>();
     
    do{
        System.out.println("----------------------------------------------------");
        System.out.println("1. Hire Manage");
        System.out.println("2. Hire Worker ");
        System.out.println("3. Display information of all employees");
        System.out.println("4.Update basic salary");
        System.out.println("5. Exit");

        System.out.println("Select your choice : ");
        choice = sc.nextInt();

        switch(choice){

            case 1 : 
                        System.out.println("Enter the details of Manager : ");
                        sc.nextLine();
                        System.out.println("Enter the name : ");
                        sc.nextLine();
                        System.out.println("Enter the basic salary : ");
                        sc.nextDouble();
                        System.out.println("Bonus: ");
                        sc.nextDouble();

                        e = new Mgr(name,basicSalary,Bonus);
                        list.add(e);
                        list[counter++]=e;
        }
    }while(choice >= 6);
    }
}
