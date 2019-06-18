
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String nm){
		name = nm;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public String toString(){
		return "\n >> Name: " + name + ", Age: " + age;
	}
}
