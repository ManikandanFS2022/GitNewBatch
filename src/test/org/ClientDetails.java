package test.org;

import sample.org.EmployeeDetails;

public class ClientDetails extends EmployeeDetails{

	public void clientName() {
	System.out.println("Client name: HCL");
	}
	
	public void clientLocation() {
	System.out.println("Client location: Chennai");
	}
	
	public static void main(String[] args) {
		ClientDetails c = new ClientDetails();
	c.clientName();
	c.clientLocation();
	c.studentName();
	c.studentLocation();
	c.employeeName();
	c.employeeAge();
	}
	
	
	
	
	
	
}
