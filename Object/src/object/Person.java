package object;

public class Person {
	
	String name;
	String sex;
	String job;
	int age;
	
	public Person() {
		
	}
	
	public Person(String a, String b,String c,int d) {
		name = a;
		sex = b;
		job = c;
		age = d;
			
		
		
	}
	
	
	void printInfos() {
		System.out.println("name: " + name);
		System.out.println("sex: " + sex);
		System.out.println("job: " + job);
		System.out.println("age: " + age);
		System.out.println();
	}
	
}
