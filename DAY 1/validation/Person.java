package validation;

public class Person {
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public String toString(){
		return "name is "+name +"  and age is "+age;
		}
	}
