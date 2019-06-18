
public class Student {
	private String name;
	private String roll_no;
	private double cgpa;
	
	public Student(String name, String roll_no, double cgpa){
		this.name = name;
		this.roll_no = roll_no;
		this.cgpa = cgpa;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setRollno(String roll){
		roll_no = roll;
	}
	
	public String getRollno(){
		return roll_no;
	}
	
	public void setCgpa(double cumu_gpa){
		cgpa = cumu_gpa;
	}
	
	public double getCgpa(){
		return cgpa;
	}
	
	
}
