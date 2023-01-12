package Week19.EmployeeInfo;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	

	
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	

	public Employee(String n, int id,
					String dept, String pos) {
		name = n;
		idNumber = id;
		department = dept;
		position = pos;
		
	}
	
	public Employee(String n, int id) {
		name = n;
		idNumber = id;
		department = "";
		position = "";
		
	}
	

	
	public void setName(String n) {
		name = n;
	}

	public void setIdNumber(int num) {
		idNumber = num;
	}

	public void setDepartment(String d) {
		department = d;
	}

	public void setPosition(String p) {
		position = p;
	}

	
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}

	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
}
