package session24;

public class Student {

	private String name;
	private int age;  
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
			if (age < 0) {

				throw new Exception("age can't be negative");

			}

			this.age = age;
		} 

		catch (Exception e) {
			System.out.println(e);

		}

	}
//	public void setAge(int age) throws Exception {
//		if(age < 0){
//			throw new Exception("age can't be negative");
//		}
//		this.age = age;
//	}
	public Student(){
		this.name = "nitin";
		this.age = 19;
	}
	public Student(String name , int age){
		this.name = name;
		this.age = age;
		
	}
	public void introduce(){
		String name = "sahil";
		System.out.println(" I am " + this.name +"  and age is " + this.age);
	}
	
	@Override
	public String toString(){
		return this.name +"  " + this.age;
	}
	
	
	
}
