package curriculumB;

public abstract class Employee4 {
	//4
	// 
	String employeeId4;
	String name4;
	
	public Employee4(String id, String name) {
		this.employeeId4 = id;
		this.name4 = name;
		
	}
	public String getEmployeeId() {
		return employeeId4;
	}
	public String getName() {
		return name4;
	}
	public abstract int calculateDailyWage(int hoursWorked);
}