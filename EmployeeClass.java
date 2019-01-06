
public class EmployeeClass{
	private int ID;
	private String Name;
	private String Date;
	private String Position;
	private String Report;
	
	EmployeeClass() {
		ID = 0;
		Name = "One";
		Date = "1/1/1111";
		Position = "null";
		Report = "null";
	}
	
	EmployeeClass(int NewID, String N, String D, String P, String R) {
		ID = NewID;
		Name = N;
		Date = D;
		Position = P;
		Report = R;
	}
	
	public void SetId (int NewID) {
		ID = NewID;
	}
	
	public int GetID () {
		return ID;
	}
	
	public void SetName(String N) {
		Name = N;
	}
	
	public String GetName() {
		return Name;
	}
	
	public void SetDate(String D) {
		Date = D;
	}
	
	public String GetDate() {
		return Date;
	}
	
	public void SetPosition(String P) {
		Position = P;
	}
	
	public String GetPosition() {
		return Position;
	}
	
	public void SetReport(String R) {
		Report = R;
	}
	
	public String GetReport() {
		return Report;
	}
}