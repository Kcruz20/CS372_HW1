public class EmployeeClassTest {
	public static void main(String[] args) {
		EmployeeClass EmployeeClassTest1 = new EmployeeClass(123, "Juan", "02/02/2011", "Manager", "Carla");
		EmployeeClass EmployeeClassTest2 = new EmployeeClass();
		System.out.println("The employees name is " + EmployeeClassTest1.GetName() + ", ID is " + EmployeeClassTest1.GetID() + ", was hired on " +EmployeeClassTest1.GetDate()+ ", position is " + EmployeeClassTest1.GetPosition() + ", and report to " + EmployeeClassTest1.GetReport() + ".");
		
		EmployeeClassTest2.SetId(321);
		EmployeeClassTest2.SetName("John");
		EmployeeClassTest2.SetDate("11/23/2003");
		EmployeeClassTest2.SetPosition("Supervisor");
		EmployeeClassTest2.SetReport("Pedro");
		
		System.out.println("The employees name is " + EmployeeClassTest2.GetName() + ", ID is " + EmployeeClassTest2.GetID() + ", was hired on " +EmployeeClassTest2.GetDate()+ ", position is " + EmployeeClassTest2.GetPosition() + ", and report to " + EmployeeClassTest2.GetReport() + ".");
		
	}

}