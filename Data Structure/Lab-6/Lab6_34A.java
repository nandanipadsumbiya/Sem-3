import java.util.*;



	class Employee_Detail{
	int employee_id;
	String  name;
	String designation;
	int salary;

	void readDetails(){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter employee_id : ");
	 employee_id=sc.nextInt();

	System.out.println("Enter name : ");
	 name=sc.next();

	System.out.println("Enter designation : ");
	 designation=sc.next();

	System.out.println("Enter salary : ");
	 salary=sc.nextInt();
	}



	 void displayDetails(){

		
		System.out.println(employee_id);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(salary);
		System.out.println("---------final------------");

	}
	

}
public class Lab6_34A{
	public static void main(String[] args) {

		Employee_Detail e1=new Employee_Detail();

		e1.readDetails();
		e1.displayDetails();
	}
}