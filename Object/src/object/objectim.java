package object;

public class objectim {

	public static void main(String[] args) {

		Person p1 = new Person("Ali", "M", "cnc", 22);
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();

		p5.name = "Ahmad";
		p5.sex = "M";
		p5.job = "programmer";
		p5.age = 25;

		p2.name = "Saly";
		p2.sex = "F";
		p2.job = "but";
		p2.age = 35;

		p3.name = "john";
		p3.sex = "M";
		p3.job = "bäcker";
		p3.age = 26;

		p4.name = "Samir";
		p4.sex = "M";
		p4.job = "Fahrer";
		p4.age = 55;

		p1.printInfos();
		p2.printInfos();
		p3.printInfos();
		p4.printInfos();
		p5.printInfos();
	}

}
